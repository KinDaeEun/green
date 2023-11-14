package com.green.mybatis.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.green.mybatis.model.Member;
import com.green.mybatis.model.MemberPhoto;
import com.green.mybatis.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	@Autowired
	private BCryptPasswordEncoder bpe;

	@GetMapping("joinForm2")
	public void joinForm2() {
	}

	@PostMapping("join2")
	public String join2(Member member, Model model, HttpSession session, MultipartHttpServletRequest mhr)
			throws IOException {
		int result = 0;
		Member member2 = ms.select(member.getId());
		if (member2 == null) {
			List<MultipartFile> list = mhr.getFiles("file");
			List<MemberPhoto> photos = new ArrayList<MemberPhoto>();
			String real = session.getServletContext().getRealPath("/resources/upload");
			// list에서 사진명을 photos에 저장
			for (MultipartFile mf : list) {
				MemberPhoto mp = new MemberPhoto();
				String fileName1 = mf.getOriginalFilename();
				UUID uuid = UUID.randomUUID();
				String fileName = uuid + fileName1.substring(fileName1.lastIndexOf("."));
				mp.setFileName(fileName);
				mp.setId(member.getId());
				photos.add(mp); // 사진 갯수만큼
				// 사진 저장
				FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
				fos.write(mf.getBytes());
				fos.close();
				// 여러 사진 중에 최종 사진
				member.setFileName(fileName);
			}
			String encPass = bpe.encode(member.getPassword());
			member.setPassword(encPass);
			result = ms.insert(member);
			if (result > 0)
				ms.insertPhoto(photos);
		} else
			result = -1; // 이미 있는 데이터
		model.addAttribute("result", result);
		return "join";
	}

	@GetMapping("logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@GetMapping("delete")
	public void delete(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		int result = ms.delete(id);
		if (result > 0)
			session.invalidate();
		model.addAttribute("result", result);
	}

	@GetMapping("updateForm")
	public void updateForm(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
	}

	@PostMapping("update")
	public void update(Member member, Model model, HttpSession session) throws IOException {
		String fileName1 = member.getFile().getOriginalFilename();
		if (fileName1 != null && !fileName1.equals("")) {
			UUID uuid = UUID.randomUUID();
			String fileName = uuid + fileName1.substring(fileName1.lastIndexOf("."));
			member.setFileName(fileName);
			String real = session.getServletContext().getRealPath("/resources/upload");
			FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
			fos.write(member.getFile().getBytes());
			fos.close();
		}
		// 암호화
		String encPass = bpe.encode(member.getPassword());
		member.setPassword(encPass);
		// 입력/수정/삭제는 성공한 갯수
		int result = ms.update(member);
		model.addAttribute("result", result);
	}

	@GetMapping("view")
	public void view(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
	}

	@GetMapping("view2")
	public void view2(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		List<MemberPhoto> photos = ms.listPhoto(id);
		model.addAttribute("member", member);
		model.addAttribute("photos", photos);
	}

	@GetMapping("main")
	public void main(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		if (id != null && !id.equals("")) {
			Member member = ms.select(id);
			model.addAttribute("member", member);
		}
	}

	@GetMapping("joinForm")
	public void joinForm() {
	}

	@PostMapping("join")
	public void join(Member member, Model model, HttpSession session) throws IOException {
		int result = 0;
		Member member2 = ms.select(member.getId());
		if (member2 == null) {
			String fileName1 = member.getFile().getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			String fileName = uuid + fileName1.substring(fileName1.lastIndexOf("."));
			member.setFileName(fileName);
			String real = session.getServletContext().getRealPath("/resources/upload");
			FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
			fos.write(member.getFile().getBytes());
			fos.close();
			// 암호화
			String encPass = bpe.encode(member.getPassword());
			member.setPassword(encPass);
			result = ms.insert(member);
		} else
			result = -1; // 이미 있는 데이터야
		model.addAttribute("result", result);
	}

	@PostMapping("login")
	public void login(Member member, Model model, HttpSession session) {
		int result = 0;
		Member member2 = ms.select(member.getId());
		if (member2 == null || member2.getDel().equals("y"))
			result = -1; // 없는 아이디
		// bpe.matches 두개 다 암호와 시키 상태에서 비교하는 메서드
		else if (bpe.matches(member.getPassword(), member2.getPassword())) {
			result = 1; // 성공 id와 암호 일치
			session.setAttribute("id", member.getId());
		}
		model.addAttribute("result", result);
	}

	@GetMapping("loginForm")
	public void loginForm() {
	}

	@RequestMapping(value = "idChk", produces = "text/html;charset=utf-8")
	@ResponseBody // jsp로 가지말고 바로 본문을 전달
	public String idChk(String id, Model model) {
		String msg = "";
		Member member = ms.select(id);
		if (member == null)
			msg = "쭈아 ! 그 아이디 써";
		else
			msg = "사용중인 아이디니 다른 아이디를 사용하시오";
		return msg;
	}
}
package com.green.ch07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {
	@PostMapping("upload3")
	public void upload3(MultipartHttpServletRequest mhr, HttpSession session, Model model) throws IOException {
		String real = session.getServletContext().getRealPath("/resources/upload");
		String id = mhr.getParameter("id");
		String name = mhr.getParameter("name");
		List<MultipartFile> fileList = mhr.getFiles("file");
		// 하나씩 이름을 저장
		List<String> list = new ArrayList<String>();
		for (MultipartFile mf : fileList) {
			String fileName1 = mf.getOriginalFilename();
			long date = new Date().getTime();
			String fileName = date + fileName1.substring(fileName1.lastIndexOf("."));
			list.add(fileName);
			FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
			fos.write(mf.getBytes());
			fos.close();
		}
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("list", list);

	}

	@GetMapping("uploadForm3")
	public void uploadForm3() {
	}

	@GetMapping("uploadForm")
	public void uploadForm() {
	}

	@PostMapping("upload")
	public void upload(@RequestParam("file") MultipartFile mf, Member member, Model model, HttpSession session)
			throws IOException {
		String fileName = mf.getOriginalFilename();
		String real = session.getServletContext().getRealPath("/resources/upload");
		// 파일로 저장
		FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
		fos.write(mf.getBytes());
		fos.close();
		// mf.transferTo(new File("c:/spring/"+fileName));
		int fileSize = (int) mf.getSize();
		model.addAttribute("fileName", fileName);
		model.addAttribute("fileSize", fileSize);
		model.addAttribute("member", member);
	}

	@PostMapping("upload2")
	public String upload2(Member member, Model model, HttpSession session) throws IOException {
		String fileName1 = member.getFile().getOriginalFilename();
		// 파일명 변경방법
		// 날자(년월일 시분초 long형을 받아서 사용), UUID사용
		UUID uuid = UUID.randomUUID();
		String fileName = uuid + fileName1.substring(fileName1.lastIndexOf("."));
		String real = session.getServletContext().getRealPath("/resources/upload");
		// 파일로 저장
		FileOutputStream fos = new FileOutputStream(new File(real + "/" + fileName));
		fos.write(member.getFile().getBytes());
		fos.close();
		// member.getFile().transferTo(new File("c:/spring/"+fileName));
		int fileSize = (int) member.getFile().getSize();
		model.addAttribute("fileName1", fileName1);
		model.addAttribute("fileName", fileName);
		model.addAttribute("fileSize", fileSize);
		model.addAttribute("member", member);
		return "upload";
	}

}
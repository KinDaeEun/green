package samp16;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	//                       콘솔에 입력 받은 데이터
	public int insert(Member member) {
		int result = 0;
		// 데이터 중복된 것인지 확인
		Member member2 = md.select(member.getId());
		if (member2 == null) result = md.insert(member);
		else System.out.println("이미 있는 데이터입니다");
		return result;
	}
	public void select(String id) {
		Member member = md.select(id);
		if (member == null) 
			System.out.println("없는 데이터 입니다");
		else print(member);		
	}
	private void print(Member member) {
		System.out.println("회원 정보");
		System.out.println("아이디 : "+member.getId());
		System.out.println("이름 : "+member.getName());
		System.out.println("이메일 : "+member.getEmail());
		System.out.println("등록일 : "+member.getReg_date());
	}
	public int update(Member member) {
		int result = 0;
		// 데이터 중복된 것인지 확인
		Member member2 = md.select(member.getId());
		if (member2 != null) result = md.update(member);
		else System.out.println("없는 데이터는 수정 못합니다");
		return result;
	}
	public int delete(String id) {
		int result = 0;
		// 데이터 중복된 것인지 확인
		Member member2 = md.select(id);
		if (member2 != null) result = md.delete(id);
		else System.out.println("없는 데이터는 삭제 못합니다");
		return result;
	}
	public void list() {
		Collection<Member> list = md.list();
		if (list == null || list.size() == 0)
			System.out.println("데이터가 없습니다");
		else
			for(Member member : list) {
				print(member);
			}
	}	
}
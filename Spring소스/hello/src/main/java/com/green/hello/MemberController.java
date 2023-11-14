package com.green.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@RequestMapping("member1")
	public Member member1() {
		Member member1 = new Member();
		member1.setName("보검");
		member1.setAddr("강남");
		member1.setAge(31);
		member1.setHobby("음주");
		member1.setGender("남자");
		return member1;
	}

	@RequestMapping("member1List")
	public List<Member> member1List() {
		List<Member> memberList = new ArrayList<Member>();
		for(int i = 0;i<10;i++) {
			Member member = new Member();
			member.setName("보검"+i);
			member.setAddr("강남"+i);
			member.setAge(25+i);
			member.setHobby("음주");
			member.setGender("남자");
			memberList.add(member);
		}
		
		return memberList;
	}
}

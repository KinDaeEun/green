package com.green.ch09.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.ch09.model.Email;

@Controller
public class EtcController {
	@Autowired
	private JavaMailSender jms;
	@GetMapping("mailForm")
	public String mailForm() {
		return "/etc/mailForm";
	}
	@PostMapping("mail")
	public String mail(Email email, Model model) {
		MimeMessage mm = jms.createMimeMessage();
		try {
			MimeMessageHelper mmh = new MimeMessageHelper(mm,true,"utf-8");
			mmh.setSubject(email.getTitle());
			mmh.setText(email.getContent());
			mmh.setTo(email.getEmail());
			mmh.setFrom("yangka02@naver.com"); // 본인 naver email
			jms.send(mm);
			model.addAttribute("msg","메일 보내기 성공");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("msg","메일 보내기 실패");
		}
		return "/etc/mail";
	}
	@GetMapping("json")
	public String json() {
		return "/etc/json";
	}
}

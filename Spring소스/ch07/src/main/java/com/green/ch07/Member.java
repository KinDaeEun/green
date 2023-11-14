package com.green.ch07;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String name;
	private String fileName;
	//upload용
	private MultipartFile file;
}

package com.green.mybatis.model;
import java.sql.Date;
import org.springframework.web.multipart.MultipartFile;
import lombok.Data;
@Data
public class Member {
	private String id;
	private String email; 
	private String password;
	private String name; 
	private String fileName;;
	private String del; 
	private Date regdate; 
	// upload용
	private MultipartFile file;
}
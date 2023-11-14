package ch17;

import java.util.*;

public class Customer {
	private String id;
	private String pass;
	private String name;
	private String email;
	private Date reg_date;
	
	public Customer() {}
	
	public Customer(String id,String pass,String name,String email){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;

	}
	public String toString() {
		return "id: "+id+", 암호: "+pass+", 이름: "+name+", 이메일: "+email+", 가입일: "+reg_date; 
	}
	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	

	public String getId() {
		return id;
	}


	
}

package com.green.ch06.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
@Data
public class Customer {
	private int id;
	@NotBlank
	@Length(max=10)
	private String name;
	@NotBlank
	@Length(max=10)
	private String address;
	@NotBlank
	@Email
	@Pattern(regexp=".+@.+\\.")
	private String email;
	
	public Customer() {}
	public Customer(String name,String address,String email) {
		this.name=name;
		this.address=address;
		this.email =email;
		
	}
}

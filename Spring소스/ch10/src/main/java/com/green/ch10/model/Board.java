package com.green.ch10.model;
import java.sql.Date;
import lombok.Data;

@Data
public class Board {
	private int num;
	private String writer;
	private String subject;
	private String content;
	private int	readcount;
	private String password;
	private int	ref;
	private int	re_step;
	private int re_level;
	private Date reg_date;
	private String del;
	//paging용
	private int startRow; 
	private int endRow; 
	// 검색용
	private String search; 
	private String keyword;
}

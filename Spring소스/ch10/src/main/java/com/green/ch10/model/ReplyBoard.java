package com.green.ch10.model;
import java.sql.Date;
import lombok.Data;

@Data
public class ReplyBoard {
	private int rno;
	private int bno;
	private String replytext;
	private String replier;
	private Date regdate;
	private Date updatedate;
	private String del;
}

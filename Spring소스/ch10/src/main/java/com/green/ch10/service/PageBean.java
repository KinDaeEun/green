package com.green.ch10.service;
import lombok.Data;

@Data
public class PageBean {
	private int currentPage;
	private int rowperpage;
	private int total;
	private int totalPage;
	private int pagePerBlock = 10;
	private int startPage;
	private int endPage;
	public PageBean(int currentPage, int rowperpage, int total) {
		this.currentPage = currentPage;
		this.rowperpage = rowperpage;
		this.total = total;
		// 갯수가 10(rowPerpage)이하면 추가로 한페이지 확보
		totalPage = (int)(Math.ceil((double)total/rowperpage));
		startPage = currentPage - (currentPage - 1) % pagePerBlock;
		endPage = startPage + pagePerBlock - 1;
		if (endPage > totalPage) endPage = totalPage;
		
		
	}

}

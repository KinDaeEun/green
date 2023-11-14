package com.green.mybatis.service;

import java.util.List;

import com.green.mybatis.model.Member;
import com.green.mybatis.model.MemberPhoto;

public interface MemberService {

	Member select(String id);

	int insert(Member member);

	int update(Member member);

	int delete(String id);

	void insertPhoto(List<MemberPhoto> photos);

	List<MemberPhoto> listPhoto(String id);

}

package com.green.mybatis.dao;

import java.util.List;

import com.green.mybatis.model.Member;
import com.green.mybatis.model.MemberPhoto;

public interface MemberDao  {

	Member select(String id);

	int insert(Member member);

	int update(Member member);

	int delete(String id);

	void insertPhoto(List<MemberPhoto> photos);

	void insertPh(MemberPhoto photo);

	List<MemberPhoto> listPhoto(String id);

}

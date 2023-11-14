package com.green.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mybatis.dao.MemberDao;
import com.green.mybatis.model.Member;
import com.green.mybatis.model.MemberPhoto;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;

	@Override
	public Member select(String id) {
		return md.select(id);
	}

	@Override
	public int insert(Member member) {
		return md.insert(member);
	}

	@Override
	public int update(Member member) {
		return md.update(member);
	}

	@Override
	public int delete(String id) {
		return md.delete(id);
	}

	@Override
	public void insertPhoto(List<MemberPhoto> photos) {
		
		for(MemberPhoto photo:photos) {
			md.insertPh(photo);
		}
		//md.insertPhoto(photos);
		
	}

	@Override
	public List<MemberPhoto> listPhoto(String id) {
		return md.listPhoto(id);
	}
}

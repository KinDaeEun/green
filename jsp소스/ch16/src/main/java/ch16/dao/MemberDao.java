package ch16.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ch16.model.Member;

public class MemberDao {
	// singleton
	private static MemberDao instance = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return instance;
	}

	private static SqlSession session; // mybatis사용할 객체
	// 초기화 블럭(자바 5장 75page) 멤버변수 값 초기화에 사용
	// {}를 쓰면 인스탄스 초기화블럭, static {} 클래스 초기화 블럭
	static {
		try {
			Reader reader = Resources.getResourceAsReader("configuration.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession(true);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//	public Member select(String id) {
//		return (Member) session.selectOne("memberns.select", id);
//	}
	public Member select(String id) {
		return(Member) session.selectOne("memberns.select",id);
	}

	public int insert(Member member) {
		return session.insert("memberns.insert", member);
	}

	public int update(Member member) {
		return session.update("memberns.update", member);
	}

	public int delete(String id) {
		return session.update("memberns.delete", id);
	}

	public int getTotal() {
		return (int) session.selectOne("memberns.getTotal");
	}

	public List<Member> list(int startRow, int endRow) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		return session.selectList("memberns.list", map);
	}
}
package samp16;
public interface MemberService {
	int insert(Member member);
	void select(String id);
	int update(Member member);
	int delete(String id);
	void list();

}
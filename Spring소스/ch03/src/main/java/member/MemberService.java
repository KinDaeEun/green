package member;

public interface MemberService {

	int insert(Member member);

	void select(String id);

	int update(Member member);

	void list();

	int delete(String id);

}

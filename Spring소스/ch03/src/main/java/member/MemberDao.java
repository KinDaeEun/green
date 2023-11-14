package member;

import java.util.List;

public interface MemberDao {

	Member select(String string);

	int insert(Member member);

	int update(Member member);

	List<Member> list();

	int delete(String id);


}

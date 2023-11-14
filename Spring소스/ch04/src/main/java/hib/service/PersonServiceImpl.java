package hib.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hib.dao.PersonDao;
import hib.model.Person;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao pd;
	public int insert(Person person) {
		int result = 0;
		Person person2 = pd.select(person.getId());
		if (person2 == null) {
			pd.save(person);
			result = 1;
		} else System.out.println("이미 있는 데이터 입니다");	
		return result;
	}
	public void select(String id) {
		Person person = pd.select(id);
		if (person == null)
			System.out.println("없는 데이터 입니다");
		else print(person);
	}
	private void print(Person person) {
		System.out.println("=== 회원 정보 ===");
		System.out.println("아이디 : "+person.getId());
		System.out.println("이름 : "+person.getName());
	}
	public int update(Person person) {
		int result = 0;
		Person person2 = pd.select(person.getId());
		if (person2 != null) {
			pd.update(person);
			result = 1;
		} else System.out.println("없는 데이터는 수정 어쩔");	
		return result;
	}
	public void list() {
		List<Person> list = pd.list();
		if (list == null || list.size() == 0)
			System.out.println("데이터가 없는 허걱 !!!");
		else
			for(Person person : list) {
				print(person);
			}
	}
	public int delete(Person person) {
		int result = 0;
		Person person2 = pd.select(person.getId());
		if (person2 != null) {
			pd.delete(person);
			result = 1;
		} else System.out.println("없는 데이터는 삭제가 안됩니다");	
		return result;
	}
}
package hib.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import hib.model.Person;
@Repository
@Transactional(readOnly = false)
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private HibernateTemplate ht;
	public Person select(String id) {
		// Person 클래스명
		return ht.get(Person.class, id);
	}
	public void save(Person person) {
		ht.save(person);		
	}
	public void update(Person person) {
		ht.update(person);
	}
	@SuppressWarnings("unchecked")
	public List<Person> list() {
		// 주의사항 : from 뒤에 오는 것은 테이블이 아니라 클래스명
		return (List<Person>) ht.find("from Person");
	}
	public void delete(Person person) {
		// 반드시 객체형식
		ht.delete(person);
	}
}
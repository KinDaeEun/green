package hib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity //JPA 사용할때 ORM을 지원하는 클래스
public class Person {
	private String id ;
	private String name;
	@Id //테이블에서 사용하는 키
	@Column(name="id") //실제 테이블에서 사용하는 키, 같으면 생략
	public String getId() {
		return id;
	}
}

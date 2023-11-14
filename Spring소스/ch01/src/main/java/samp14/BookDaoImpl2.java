package samp14;

import org.springframework.stereotype.Repository;

@Repository("bd2")
public class BookDaoImpl2 implements BookDao{

	public Book getBook(String title) {
		return new Book(title, 4000);
	}

}

package samp14;

import org.springframework.stereotype.Repository;

@Repository("bd1")
public class BookDaoImpl implements BookDao{

	public Book getBook(String title) {
		return new Book(title, 20000);
	}

}

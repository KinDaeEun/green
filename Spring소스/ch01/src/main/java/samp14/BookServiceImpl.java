package samp14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	@Qualifier("bd2")
	private BookDao bd;

	public Book getBook() {
		return bd.getBook("대지");
	}
	
}

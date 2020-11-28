package org.mockito.book;

import java.util.List;

public class BookService {
BookRepository bookRepository;

public BookService(BookRepository bookRepository) {
	this.bookRepository = bookRepository;
}

public boolean add(Book book) {
	if(book.getTitle().isEmpty()) {
		return false;
	}
	return bookRepository.addBook(book);
}

public void remove(Book book) {
	bookRepository.removeBook(book.getId());
}
public List<Book> list() {
	return bookRepository.listBooks();
}


}

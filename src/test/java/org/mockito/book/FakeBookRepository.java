package org.mockito.book;

import java.util.ArrayList;
import java.util.List;

public class FakeBookRepository implements BookRepository{

	List<Book> books;
	Integer index;

	public FakeBookRepository() {
		books = new ArrayList<Book>(10);
		index = new Integer(0);
	}

	public boolean addBook(Book book) {
		if (index < 10) {
			books.add(index, book);
			index++;
			return true;
		} 
		return false;
	}

	public void removeBook(int id) {
		books.removeIf(book->book.getId() == id);
	}

	public List<Book> listBooks() {
		books.forEach(book-> System.out.println(book));
		return books;
	}
	


}

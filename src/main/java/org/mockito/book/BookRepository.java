package org.mockito.book;

import java.util.List;

/**
 * 
 * @author Suganya.Prasad
 *
 */
public interface BookRepository {
	
	public boolean addBook(Book book);

	public void removeBook(int id);

	public List<Book> listBooks();
}

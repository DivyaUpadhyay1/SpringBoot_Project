package com.booksmgmt.service;

import java.util.List;

import com.booksmgmt.model.Book;

public interface BookService_Interface {

	// Save operation
	Book createBook(Book book);
	
	// Read operation
	List<Book> getAllBooks();
	
	// Update operation
	Book updateBook(Long id, Book updatedBook);
	
	// Delete operation
	void deleteBook(Long id);
}

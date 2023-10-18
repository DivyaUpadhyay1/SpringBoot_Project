package com.booksmgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.booksmgmt.model.Book;
import com.booksmgmt.repository.BookRepository;

@Component
public class BookDAO {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
    	if (bookRepository.existsById(id)) {
    		book.setBookId(id); 
        return bookRepository.save(book);
    }return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

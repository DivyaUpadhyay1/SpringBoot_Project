package com.booksmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksmgmt.dao.BookDAO;
import com.booksmgmt.model.Book;


@Service
public class BookService implements BookService_Interface {
    private final BookDAO BookDao;

    @Autowired
    public BookService(BookDAO BookDao) {
        this.BookDao = BookDao;
    }
  @Override
    public List<Book> getAllBooks() {
        return BookDao.getAllBooks();
    }

  @Override
    public Book createBook(Book book) {
        return BookDao.createBook(book);
    }

  @Override
    public Book updateBook(Long id, Book updatedBook) {
       
            updatedBook.setBookId(id);
            return BookDao.updateBook(id, updatedBook);
        }
    
  @Override
    public void deleteBook(Long id) {
    	BookDao.deleteBook(id);
    }
}




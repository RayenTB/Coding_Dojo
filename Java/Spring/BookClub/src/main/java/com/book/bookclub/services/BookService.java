package com.book.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookclub.models.Book;
import com.book.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
//get one
	public Book getOneBook(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
//Get All
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
//Create
	public Book createNewBook(Book newBook) {
		return bookRepository.save(newBook);
	}
//Update
	public Book updateBook(Book updatedBook) {
		return this.bookRepository.save(updatedBook);
	}
//Delete
	public void deleteBook(Long id) {
		this.bookRepository.deleteById(id);
	}
	
	
	
	
}
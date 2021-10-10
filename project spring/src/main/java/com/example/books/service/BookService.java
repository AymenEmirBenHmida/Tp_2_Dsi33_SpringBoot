package com.example.books.service;

import java.util.List;



import org.springframework.data.domain.Page;

import com.example.books.entities.Author;
import com.example.books.entities.Book;
public interface BookService {
	
	
	Book saveBook(Book b);
	Book updateBook(Book p);
	void deleteBook(Book p);
	void deleteBookById(Long id);
	Book getBook(Long id);
	List<Book> getAllBooks();
	Page<Book> getAllBooksParPage(int page, int size);
	List<Book> findByNomBook(String nom);
	List<Book> findByNomBookContains(String nom);
	List<Book> findByAuthor (Author author);
	List<Book> findByAuthorIdAuthor(Long id);
	List<Book> findByOrderByNomBookAsc();
	List<Book> trierBooksNomsPrix();
	List<Book> findByNomPrix (String nom, Double prix);
	

}
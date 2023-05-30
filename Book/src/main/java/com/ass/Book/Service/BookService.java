package com.ass.Book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ass.Book.Entity.Book;
import com.ass.Book.Repository.BookDAO;

@Service
public class BookService
{
	@Autowired
	private BookDAO dao;
	
	public Book saveBookData(Book book)
	{
		return dao.saveBook(book);
	}
	public List<Book> findAllBooks()
	{
		return dao.getAllBooks();
	}
	public Optional<Book> getByBook(int id)
	{
		return dao.getByBookById(id);
	}
	public void deleteByBook(int id)
	{
		 dao.deleteBookById(id);
	}
	public Book updateBookById(Book book)
	{
		return dao.saveBook(book);
	}
}

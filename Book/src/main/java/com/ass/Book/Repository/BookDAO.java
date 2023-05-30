package com.ass.Book.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.representer.BaseRepresenter;

import com.ass.Book.Entity.Book;

import ch.qos.logback.core.status.Status;

@Repository
public class BookDAO 
{
	@Autowired
	private BookRepository repository;
	
	public Book saveBook(Book book)
	{
		return  repository.save(book);
	}
	public List<Book> getAllBooks()
	{
		return repository.findAll();
	}
	public Optional<Book> getByBookById(int id)
	{
		return repository.findById(id);
	}
	public void deleteBookById(int id)
	{
		repository.deleteById(id);
	}
	
}

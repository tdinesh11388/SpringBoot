package com.ass.Book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ass.Book.Entity.Book;
import com.ass.Book.Service.BookService;

@RestController
public class BookController
{
	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public @ResponseBody Book saveBook(@RequestBody Book book)
	{
		return service.saveBookData(book);
	}
	@GetMapping("/book")
	public @ResponseBody List<Book> getAllBooks()
	{
		return service.findAllBooks();
	}
	@GetMapping("/book/{id}")
	public @ResponseBody Optional<Book> getByBookId(@PathVariable("id") int id)
	{
		return service.getByBook(id);
	}
	@DeleteMapping("/book/{id}")
	public @ResponseBody void deleteBookById(@PathVariable("id") int id)
	{
		service.deleteByBook(id);
	}
	@PostMapping("/Book")
	public @ResponseBody Book updateBookById(@RequestBody Book book)
	{
		return service.updateBookById(book);
	}
	
	@GetMapping("/Urlbook")
	public @ResponseBody String getMessage()
	{
		return "SpringBoot";
	}
}

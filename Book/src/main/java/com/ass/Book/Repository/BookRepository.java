package com.ass.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ass.Book.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}

package com.ass.Book.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="book_info")
public class Book
{
	@Id
	@GenericGenerator(name = "auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String authorName;
	@Column
	private double price;
	
	
}

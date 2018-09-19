package com.filedownload.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.filedownload.model.Book;

@Component
@Path("/books")
public class BookController {

	@GET
	@Produces("application/json")
	public Collection<Book> getAllBooks() {

		Collection<Book> collection = new ArrayList<Book>();
		populateCollection(collection);

		return collection;
	}
	
	private void populateCollection(Collection<Book> collection ) {
		Book book1 = new Book();
		book1.setAuthor("me");
		book1.setName("lessons in Jersey");
		book1.setOid("777");
		
		collection.add(book1);
		
	}

}

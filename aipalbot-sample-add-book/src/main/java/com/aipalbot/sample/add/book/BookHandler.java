package com.aipalbot.sample.add.book;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class BookHandler implements RequestHandler<BookRequest,BookResponse> {

	@Override
	public BookResponse handleRequest(BookRequest input, Context context) {
		List<Book> books = new ArrayList<>();
		Book b = new Book();
		b.setBookName("Social Distancing");
		b.setBookType("AWS");
		b.setAuthor("Aipalbot");
		b.setEdition (" Edition 5");
		b.setChapter("chapter 1 to 10");
		
		
		Book b1 = new Book();
		b1.setBookName("Covid-19");
		b1.setBookType("JavaSE");
		b1.setAuthor("Robot");
		b1.setEdition (" Edition 5b");
		b1.setChapter("Write Essay from chapter 1 to 10");
		
		
		Book b2 = new Book();
		b2.setBookName("AWS Lambda");
		b2.setBookType("JavaScript");
		b2.setAuthor("Amazon");
		b2.setEdition("New edition");
		b2.setChapter(" New chapter ");
		
		Book b3 = new Book();
		b3.setBookName("API Gateway");
		b3.setBookType("React");
		b3.setAuthor("Amazon");
		b3.setEdition(" Update edition");
		b3.setChapter(" Update chapter");
				
		
		
		books.add(b);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(input.getBody());
		BookResponse response = new BookResponse();
		 response.setStatusCode(200);
		 response.setBody(books);
		 
		 return response;
		
		
		
	}

}

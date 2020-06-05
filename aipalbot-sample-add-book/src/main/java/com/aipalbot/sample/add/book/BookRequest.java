package com.aipalbot.sample.add.book;

import java.io.Serializable;

public class BookRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Book body;

	public Book getBody() {
		return body;
	}

	public void setBody(Book body) {
		this.body = body;
	}
	

}

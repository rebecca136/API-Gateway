package com.aipalbot.sample.add.book;

import java.io.Serializable;
import java.util.List;

public class BookResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Book> body;
	private Integer statusCode;
	public List<Book> getBody() {
		return body;
	}
	public void setBody(List<Book> body) {
		this.body = body;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	


}

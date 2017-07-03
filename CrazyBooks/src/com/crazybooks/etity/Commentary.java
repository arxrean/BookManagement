package com.crazybooks.etity;

import java.util.Date;

/**
 * Commentary entity. @author MyEclipse Persistence Tools
 */

public class Commentary implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Books books;
	private String commentary;
	private Date commentTime;

	// Constructors

	/** default constructor */
	public Commentary() {
	}

	/** full constructor */
	public Commentary(Users users, Books books, String commentary,
			Date commentTime) {
		this.users = users;
		this.books = books;
		this.commentary = commentary;
		this.commentTime = commentTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public String getCommentary() {
		return this.commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

}
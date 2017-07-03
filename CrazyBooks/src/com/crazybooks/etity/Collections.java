package com.crazybooks.etity;

import java.util.Date;

/**
 * Collections entity. @author MyEclipse Persistence Tools
 */

public class Collections implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Books books;
	private Date collectTime;

	// Constructors

	/** default constructor */
	public Collections() {
	}

	/** full constructor */
	public Collections(Users users, Books books, Date collectTime) {
		this.users = users;
		this.books = books;
		this.collectTime = collectTime;
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

	public Date getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}

}
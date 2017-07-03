package com.crazybooks.etity;

import java.util.Date;

/**
 * Borrow entity. @author MyEclipse Persistence Tools
 */

public class Borrow implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Books books;
	private Date borrowTime;
	private Date deadline;
	private Date returnTime;
	private Float consumption;

	// Constructors

	/** default constructor */
	public Borrow() {
	}

	/** full constructor */
	public Borrow(Users users, Books books, Date borrowTime, Date deadline,
			Date returnTime, Float consumption) {
		this.users = users;
		this.books = books;
		this.borrowTime = borrowTime;
		this.deadline = deadline;
		this.returnTime = returnTime;
		this.consumption = consumption;
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

	public Date getBorrowTime() {
		return this.borrowTime;
	}

	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getReturnTime() {
		return this.returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	public Float getConsumption() {
		return this.consumption;
	}

	public void setConsumption(Float consumption) {
		this.consumption = consumption;
	}

}
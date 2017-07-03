package com.crazybooks.etity;

import java.util.Date;

/**
 * Addusers entity. @author MyEclipse Persistence Tools
 */

public class Addusers implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Date time;

	// Constructors

	/** default constructor */
	public Addusers() {
	}

	/** full constructor */
	public Addusers(Users users, Date time) {
		this.users = users;
		this.time = time;
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

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
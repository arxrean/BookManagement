package com.crazybooks.etity;

import java.util.Date;

/**
 * Addbooks entity. @author MyEclipse Persistence Tools
 */

public class Addbooks implements java.io.Serializable {

	// Fields

	private Integer id;
	private Managers managers;
	private Integer bid;
	private Date manipulateTime;

	// Constructors

	/** default constructor */
	public Addbooks() {
	}

	/** full constructor */
	public Addbooks(Managers managers, Integer bid, Date manipulateTime) {
		this.managers = managers;
		this.bid = bid;
		this.manipulateTime = manipulateTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Managers getManagers() {
		return this.managers;
	}

	public void setManagers(Managers managers) {
		this.managers = managers;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Date getManipulateTime() {
		return this.manipulateTime;
	}

	public void setManipulateTime(Date manipulateTime) {
		this.manipulateTime = manipulateTime;
	}

}
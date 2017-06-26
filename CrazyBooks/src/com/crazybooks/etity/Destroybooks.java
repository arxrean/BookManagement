package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Destroybooks entity. @author MyEclipse Persistence Tools
 */

public class Destroybooks implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer bid;
	private Integer manipulator;
	private Timestamp manipulateTime;

	// Constructors

	/** default constructor */
	public Destroybooks() {
	}

	/** full constructor */
	public Destroybooks(Integer bid, Integer manipulator,
			Timestamp manipulateTime) {
		this.bid = bid;
		this.manipulator = manipulator;
		this.manipulateTime = manipulateTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getManipulator() {
		return this.manipulator;
	}

	public void setManipulator(Integer manipulator) {
		this.manipulator = manipulator;
	}

	public Timestamp getManipulateTime() {
		return this.manipulateTime;
	}

	public void setManipulateTime(Timestamp manipulateTime) {
		this.manipulateTime = manipulateTime;
	}

}
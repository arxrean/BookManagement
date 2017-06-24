package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Borrow entity. @author MyEclipse Persistence Tools
 */

public class Borrow implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer bid;
	private Timestamp borrowTime;
	private Timestamp deadline;
	private Timestamp returnTime;
	private Float consumption;

	// Constructors

	/** default constructor */
	public Borrow() {
	}

	/** full constructor */
	public Borrow(Integer uid, Integer bid, Timestamp borrowTime,
			Timestamp deadline, Timestamp returnTime, Float consumption) {
		this.uid = uid;
		this.bid = bid;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Timestamp getBorrowTime() {
		return this.borrowTime;
	}

	public void setBorrowTime(Timestamp borrowTime) {
		this.borrowTime = borrowTime;
	}

	public Timestamp getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}

	public Timestamp getReturnTime() {
		return this.returnTime;
	}

	public void setReturnTime(Timestamp returnTime) {
		this.returnTime = returnTime;
	}

	public Float getConsumption() {
		return this.consumption;
	}

	public void setConsumption(Float consumption) {
		this.consumption = consumption;
	}

}
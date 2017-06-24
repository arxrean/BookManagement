package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Collections entity. @author MyEclipse Persistence Tools
 */

public class Collections implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer bid;
	private Timestamp collectTime;

	// Constructors

	/** default constructor */
	public Collections() {
	}

	/** full constructor */
	public Collections(Integer uid, Integer bid, Timestamp collectTime) {
		this.uid = uid;
		this.bid = bid;
		this.collectTime = collectTime;
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

	public Timestamp getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Timestamp collectTime) {
		this.collectTime = collectTime;
	}

}
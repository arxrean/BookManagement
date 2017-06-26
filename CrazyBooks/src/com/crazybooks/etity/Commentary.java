package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Commentary entity. @author MyEclipse Persistence Tools
 */

public class Commentary implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer bid;
	private String commentary;
	private Timestamp commentTime;

	// Constructors

	/** default constructor */
	public Commentary() {
	}

	/** full constructor */
	public Commentary(Integer uid, Integer bid, String commentary,
			Timestamp commentTime) {
		this.uid = uid;
		this.bid = bid;
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

	public String getCommentary() {
		return this.commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Timestamp getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}

}
package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Recharge entity. @author MyEclipse Persistence Tools
 */

public class Recharge implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Float amount;
	private Timestamp rechargeTime;

	// Constructors

	/** default constructor */
	public Recharge() {
	}

	/** full constructor */
	public Recharge(Integer uid, Float amount, Timestamp rechargeTime) {
		this.uid = uid;
		this.amount = amount;
		this.rechargeTime = rechargeTime;
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

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Timestamp getRechargeTime() {
		return this.rechargeTime;
	}

	public void setRechargeTime(Timestamp rechargeTime) {
		this.rechargeTime = rechargeTime;
	}

}
package com.crazybooks.etity;

import java.util.Date;

/**
 * Recharge entity. @author MyEclipse Persistence Tools
 */

public class Recharge implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Float amount;
	private Date rechargeTime;

	// Constructors

	/** default constructor */
	public Recharge() {
	}

	/** full constructor */
	public Recharge(Users users, Float amount, Date rechargeTime) {
		this.users = users;
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

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getRechargeTime() {
		return this.rechargeTime;
	}

	public void setRechargeTime(Date rechargeTime) {
		this.rechargeTime = rechargeTime;
	}

}
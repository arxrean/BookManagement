package com.crazybooks.etity;

import java.util.Date;

/**
 * Freeze entity. @author MyEclipse Persistence Tools
 */

public class Freeze implements java.io.Serializable {

	// Fields

	private Integer id;
	private Managers managers;
	private Users users;
	private Date manipulateTime;
	private Integer freezeTime;
	private String reason;

	// Constructors

	/** default constructor */
	public Freeze() {
	}

	/** full constructor */
	public Freeze(Managers managers, Users users, Date manipulateTime,
			Integer freezeTime, String reason) {
		this.managers = managers;
		this.users = users;
		this.manipulateTime = manipulateTime;
		this.freezeTime = freezeTime;
		this.reason = reason;
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

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getManipulateTime() {
		return this.manipulateTime;
	}

	public void setManipulateTime(Date manipulateTime) {
		this.manipulateTime = manipulateTime;
	}

	public Integer getFreezeTime() {
		return this.freezeTime;
	}

	public void setFreezeTime(Integer freezeTime) {
		this.freezeTime = freezeTime;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
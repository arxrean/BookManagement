package com.crazybooks.etity;

import java.sql.Timestamp;

/**
 * Freeze entity. @author MyEclipse Persistence Tools
 */

public class Freeze implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer manipulator;
	private Timestamp manipulateTime;
	private Integer freezeTime;
	private String reason;

	// Constructors

	/** default constructor */
	public Freeze() {
	}

	/** full constructor */
	public Freeze(Integer uid, Integer manipulator, Timestamp manipulateTime,
			Integer freezeTime, String reason) {
		this.uid = uid;
		this.manipulator = manipulator;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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
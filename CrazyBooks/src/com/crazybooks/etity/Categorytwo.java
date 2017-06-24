package com.crazybooks.etity;

/**
 * Categorytwo entity. @author MyEclipse Persistence Tools
 */

public class Categorytwo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer preId;

	// Constructors

	/** default constructor */
	public Categorytwo() {
	}

	/** full constructor */
	public Categorytwo(String name, Integer preId) {
		this.name = name;
		this.preId = preId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPreId() {
		return this.preId;
	}

	public void setPreId(Integer preId) {
		this.preId = preId;
	}

}
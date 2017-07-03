package com.crazybooks.etity;

import java.util.HashSet;
import java.util.Set;

/**
 * Categoryone entity. @author MyEclipse Persistence Tools
 */

public class Categoryone implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set categorytwos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Categoryone() {
	}

	/** full constructor */
	public Categoryone(String name, Set categorytwos) {
		this.name = name;
		this.categorytwos = categorytwos;
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

	public Set getCategorytwos() {
		return this.categorytwos;
	}

	public void setCategorytwos(Set categorytwos) {
		this.categorytwos = categorytwos;
	}

}
package com.crazybooks.etity;

import java.util.HashSet;
import java.util.Set;

/**
 * Categorytwo entity. @author MyEclipse Persistence Tools
 */

public class Categorytwo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Categoryone categoryone;
	private String name;
	private Set bookses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Categorytwo() {
	}

	/** full constructor */
	public Categorytwo(Categoryone categoryone, String name, Set bookses) {
		this.categoryone = categoryone;
		this.name = name;
		this.bookses = bookses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Categoryone getCategoryone() {
		return this.categoryone;
	}

	public void setCategoryone(Categoryone categoryone) {
		this.categoryone = categoryone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBookses() {
		return this.bookses;
	}

	public void setBookses(Set bookses) {
		this.bookses = bookses;
	}

}
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
	private Set<Categorytwo> Categorytwos=new HashSet<Categorytwo>();
	public Categoryone() {
		// TODO Auto-generated constructor stub
	}
	public void setCategorytwos(Set<Categorytwo> categorytwos) {
		Categorytwos = categorytwos;
	}
	public Set<Categorytwo> getCategorytwos() {
		return Categorytwos;
	}
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

}
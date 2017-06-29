package com.crazybooks.etity;

import java.util.HashSet;
import java.util.Set;

/**
 * Categorytwo entity. @author MyEclipse Persistence Tools
 */

public class Categorytwo implements java.io.Serializable {
	private Integer id;
	private String name;
	private Categoryone categoryone;
	private Set<Books> books=new HashSet<Books>();
	public void setBooks(Set<Books> books) {
		this.books = books;
	}
	public Set<Books> getBooks() {
		return books;
	}
	public Categorytwo() {
		// TODO Auto-generated constructor stub
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
	public void setCategoryone(Categoryone categoryone) {
		this.categoryone = categoryone;
	}
	public Categoryone getCategoryone() {
		return categoryone;
	}

}
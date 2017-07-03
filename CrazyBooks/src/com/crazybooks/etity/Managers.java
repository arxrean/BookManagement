package com.crazybooks.etity;

import java.util.HashSet;
import java.util.Set;

/**
 * Managers entity. @author MyEclipse Persistence Tools
 */

public class Managers implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private Set freezes = new HashSet(0);
	private Set destroybookses = new HashSet(0);
	private Set addbookses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Managers() {
	}

	/** full constructor */
	public Managers(String name, String password, Set freezes,
			Set destroybookses, Set addbookses) {
		this.name = name;
		this.password = password;
		this.freezes = freezes;
		this.destroybookses = destroybookses;
		this.addbookses = addbookses;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getFreezes() {
		return this.freezes;
	}

	public void setFreezes(Set freezes) {
		this.freezes = freezes;
	}

	public Set getDestroybookses() {
		return this.destroybookses;
	}

	public void setDestroybookses(Set destroybookses) {
		this.destroybookses = destroybookses;
	}

	public Set getAddbookses() {
		return this.addbookses;
	}

	public void setAddbookses(Set addbookses) {
		this.addbookses = addbookses;
	}

}
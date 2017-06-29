package com.crazybooks.etity;

import java.awt.print.Book;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {
	private Integer id;
	private String name;
	private String picture;
	private String intro;
	private String author;
	private String pubHouse;
	private Float price;
	private Categorytwo categorytwo;
	private Integer state;
	public void setCategorytwo(Categorytwo categorytwo) {
		this.categorytwo = categorytwo;
	}
	public Categorytwo getCategorytwo() {
		return categorytwo;
	}
	public Books() {
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

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubHouse() {
		return this.pubHouse;
	}

	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	public Books(Integer id, String name, String picture, String intro,
			String author, String pubHouse, Float price,
			Categorytwo categorytwo, Integer state) {
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.intro = intro;
		this.author = author;
		this.pubHouse = pubHouse;
		this.price = price;
		this.categorytwo = categorytwo;
		this.state = state;
	}
	
}
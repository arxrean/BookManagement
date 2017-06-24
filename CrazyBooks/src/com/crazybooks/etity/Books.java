package com.crazybooks.etity;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String picture;
	private String intro;
	private String author;
	private String pubHouse;
	private Float price;
	private Integer category;
	private Integer state;

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** full constructor */
	public Books(String name, String picture, String intro, String author,
			String pubHouse, Float price, Integer category, Integer state) {
		this.name = name;
		this.picture = picture;
		this.intro = intro;
		this.author = author;
		this.pubHouse = pubHouse;
		this.price = price;
		this.category = category;
		this.state = state;
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

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
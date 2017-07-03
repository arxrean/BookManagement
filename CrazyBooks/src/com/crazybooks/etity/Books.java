package com.crazybooks.etity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {

	// Fields

	private Integer id;
	private Categorytwo categorytwo;
	private String name;
	private String picture;
	private String intro;
	private String author;
	private String pubHouse;
	private Float price;
	private Integer state;
	private Date pubDate;
	private Integer btime;
	private Set collectionses = new HashSet(0);
	private Set borrows = new HashSet(0);
	private Set commentaries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** minimal constructor */
	public Books(Categorytwo categorytwo) {
		this.categorytwo = categorytwo;
	}

	/** full constructor */
	public Books(Categorytwo categorytwo, String name, String picture,
			String intro, String author, String pubHouse, Float price,
			Integer state, Date pubDate, Integer btime, Set collectionses,
			Set borrows, Set commentaries) {
		this.categorytwo = categorytwo;
		this.name = name;
		this.picture = picture;
		this.intro = intro;
		this.author = author;
		this.pubHouse = pubHouse;
		this.price = price;
		this.state = state;
		this.pubDate = pubDate;
		this.btime = btime;
		this.collectionses = collectionses;
		this.borrows = borrows;
		this.commentaries = commentaries;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Categorytwo getCategorytwo() {
		return this.categorytwo;
	}

	public void setCategorytwo(Categorytwo categorytwo) {
		this.categorytwo = categorytwo;
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

	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public Integer getBtime() {
		return this.btime;
	}

	public void setBtime(Integer btime) {
		this.btime = btime;
	}

	public Set getCollectionses() {
		return this.collectionses;
	}

	public void setCollectionses(Set collectionses) {
		this.collectionses = collectionses;
	}

	public Set getBorrows() {
		return this.borrows;
	}

	public void setBorrows(Set borrows) {
		this.borrows = borrows;
	}

	public Set getCommentaries() {
		return this.commentaries;
	}

	public void setCommentaries(Set commentaries) {
		this.commentaries = commentaries;
	}

}
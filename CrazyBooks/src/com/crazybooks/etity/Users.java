package com.crazybooks.etity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String idnum;
	private String userName;
	private String name;
	private Integer sex;
	private Float balance;
	private String email;
	private String address;
	private String password;
	private Integer score;
	private Integer rank;
	private String phoneNum;
	private String image;
	private Set freezes = new HashSet(0);
	private Set recharges = new HashSet(0);
	private Set adduserses = new HashSet(0);
	private Set collectionses = new HashSet(0);
	private Set borrows = new HashSet(0);
	private Set commentaries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String idnum, String userName, String name, Integer sex,
			Float balance, String email, String address, String password,
			Integer score, Integer rank, String phoneNum, String image,
			Set freezes, Set recharges, Set adduserses, Set collectionses,
			Set borrows, Set commentaries) {
		this.idnum = idnum;
		this.userName = userName;
		this.name = name;
		this.sex = sex;
		this.balance = balance;
		this.email = email;
		this.address = address;
		this.password = password;
		this.score = score;
		this.rank = rank;
		this.phoneNum = phoneNum;
		this.image = image;
		this.freezes = freezes;
		this.recharges = recharges;
		this.adduserses = adduserses;
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

	public String getIdnum() {
		return this.idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getFreezes() {
		return this.freezes;
	}

	public void setFreezes(Set freezes) {
		this.freezes = freezes;
	}

	public Set getRecharges() {
		return this.recharges;
	}

	public void setRecharges(Set recharges) {
		this.recharges = recharges;
	}

	public Set getAdduserses() {
		return this.adduserses;
	}

	public void setAdduserses(Set adduserses) {
		this.adduserses = adduserses;
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
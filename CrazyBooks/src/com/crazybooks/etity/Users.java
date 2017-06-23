package com.crazybooks.etity;

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

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String idnum, String userName, String name, Integer sex,
			Float balance, String email, String address, String password,
			Integer score, Integer rank, String phoneNum) {
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

}
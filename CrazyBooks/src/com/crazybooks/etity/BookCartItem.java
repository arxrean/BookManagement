package com.crazybooks.etity;

import java.io.Serializable;

import javax.ws.rs.GET;

public class BookCartItem implements Serializable{
	Books book;
	int num;
	float subTotal;
	String date;
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getSubTotal() {
		return book.getPrice()*num;
	}
	
}

package com.crazybooks.action;


import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookCartAction extends ActionSupport{
	
	private int[] booksInCart;
	private Date[] returnDate;
	
	public int[] getBookId() {
		return booksInCart;
	}

	public void setBookId(int[] booksInCart) {
		this.booksInCart = booksInCart;
	}

	public Date[] getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date[] returnDate) {
		this.returnDate = returnDate;
	}

	public String Return(){
		return SUCCESS;
	}
	
	public String Borrow()
	{
		for(int i=0;i<booksInCart.length;i++){
			System.out.println(booksInCart[i]+"+"+returnDate[i]);
		}
		return SUCCESS;
	}
}

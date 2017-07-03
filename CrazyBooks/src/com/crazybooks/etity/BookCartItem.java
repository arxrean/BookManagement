package com.crazybooks.etity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;

public class BookCartItem implements Serializable{
	Books book;
	int num;
	float subTotal;
	String calendar;
	public void setCalendar(String calendar) {
		this.calendar = calendar;
	}
	public String getCalendar() {
		return calendar;
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
	public float getSubTotal() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(calendar);
		@SuppressWarnings("deprecation")
		int bDays=date.getDay()+date.getMonth()*30+date.getYear()*365;
		Date currentTime=new Date();
		
		@SuppressWarnings("deprecation")
		int currentDays=currentTime.getDay()+currentTime.getMonth()+currentTime.getYear()*365;
		return book.getPrice()*(bDays-currentDays)*0.005f;
	}
}

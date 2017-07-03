package com.crazybooks.action;

import com.crazybooks.etity.Books;
import com.crazybooks.etity.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SingleBookAction extends ActionSupport implements ModelDriven<Books>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Books book;

	@Override
	public Books getModel() {
		// TODO Auto-generated method stub
		if(book==null){
			book=new Books();
		}
		return book;
	}	
}

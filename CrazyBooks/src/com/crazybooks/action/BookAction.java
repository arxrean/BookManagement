package com.crazybooks.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.crazybooks.biz.impl.BookBizImpl;
import com.crazybooks.etity.Books;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class BookAction extends ActionSupport implements ModelDriven<Books>{
	BookBizImpl bookService;
	public void setBookService(BookBizImpl bookService) {
		this.bookService = bookService;
	}
	Books book=new Books();
	public String findBooksByCid()
	{
		System.out.println("----------------------------------------------------"+book.getId());
		List bList=bookService.findBooksByCid(book.getId());
		ActionContext.getContext().put("bList", bList);
		return "bookListPage";
	}
	
	@Override
	public Books getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	
}

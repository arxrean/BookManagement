package com.crazybooks.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.crazybooks.base.impl.BookDaoImpl;
import com.crazybooks.biz.impl.BookBizImpl;
import com.crazybooks.biz.impl.CategoryOneService;
import com.opensymphony.xwork2.ActionSupport;
public class IndexAction extends ActionSupport{
	BookBizImpl bookBizImpl;
	public void setBookBizImpl(BookBizImpl bookBizImpl) {
		this.bookBizImpl = bookBizImpl;
	}
	public BookBizImpl getBookBizImpl() {
		return bookBizImpl;
	}
	CategoryOneService categoryOneService;
	public void setCategoryOneService(CategoryOneService categoryOneService) {
		this.categoryOneService = categoryOneService;
	}
	public String mainPage()
	{
		List cList=categoryOneService.findAllCname();
		ServletActionContext.getRequest().getSession().setAttribute("cList", cList);
		List bnList=bookBizImpl.findNewTopbook();
		ServletActionContext.getRequest().getSession().setAttribute("bnList", bnList);
		return "mainPage";
	}
}

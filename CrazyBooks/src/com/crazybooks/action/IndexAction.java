package com.crazybooks.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.crazybooks.biz.impl.CategoryOneService;
import com.opensymphony.xwork2.ActionSupport;
public class IndexAction extends ActionSupport{
	CategoryOneService categoryOneService;
	public void setCategoryOneService(CategoryOneService categoryOneService) {
		this.categoryOneService = categoryOneService;
	}
	public String mainPage()
	{
//		List cList=categoryOneService.findAllCname();
//		ServletActionContext.getRequest().getSession().setAttribute("cList", cList);
		return "mainPage";
	}
}

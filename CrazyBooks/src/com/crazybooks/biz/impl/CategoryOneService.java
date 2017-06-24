package com.crazybooks.biz.impl;

import java.util.List;

import com.crazybooks.base.impl.CategoryOneImpl;
public class CategoryOneService {
	CategoryOneImpl categoryOneDao;
	public void setCategoryOneDao(CategoryOneImpl categoryOneDao) {
		this.categoryOneDao = categoryOneDao;
	}
	public List findAllCname() {
		// TODO Auto-generated method stub
		return categoryOneDao.findAllCname();
	}
}

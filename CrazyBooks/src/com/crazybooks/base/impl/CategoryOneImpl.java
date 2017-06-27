package com.crazybooks.base.impl;

import java.util.List;

import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.base.CategoryOneDao;
import com.crazybooks.dao.HibernateSessionFactory;

public class CategoryOneImpl extends BaseHibernateDao implements CategoryOneDao {
	public List findAllCname() {
		// TODO Auto-generated method stub
		List list=HibernateSessionFactory.getSession().createQuery("from Categoryone").list();
		if(list.size()<1)
		{
			return null;
		}
		return list;
	}

}

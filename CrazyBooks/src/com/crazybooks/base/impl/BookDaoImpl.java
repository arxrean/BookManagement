package com.crazybooks.base.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.metamodel.source.annotations.HibernateDotNames;

import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.base.BookDao;
import com.crazybooks.dao.HibernateSessionFactory;
import com.crazybooks.etity.Books;

public class BookDaoImpl extends BaseHibernateDao implements BookDao{

	@Override
	public List getBooksByCid(int id) {
		// TODO Auto-generated method stub
		
		List bList=HibernateSessionFactory.getSession().createQuery("select books from Books books,Categorytwo ct," +
				"Categoryone co where books.categorytwo= ct.id and ct.categoryone=co.id and co.id = ?")
				.setInteger(0, id)
				.list();
		System.out.println("------------------------------------------------------>"+bList.size());
		if(bList.size()<1)
		{
			//System.out.print(bList.size());
			return null;
		}
		//System.out.println("ooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"+bList.size());
		return bList;
	}

	public List getNewTopBook() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria=DetachedCriteria.forClass(Books.class);
		criteria.addOrder(Order.desc("btime"));
		//List list=criteria.createCriteria(1,10);
		return null;
	}
}

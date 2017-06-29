package com.crazybooks.biz.impl;

import java.util.List;

import com.crazybooks.base.impl.BookDaoImpl;
import com.crazybooks.biz.BookBiz;
import com.crazybooks.dao.HibernateSessionFactory;

public class BookBizImpl implements BookBiz{
	BookDaoImpl bookDao;
	public void setBookDao(BookDaoImpl bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public List findBooksByCid(int id) {
		// TODO Auto-generated method stub
		return bookDao.getBooksByCid(id);
	}
	public List findNewTopbook() {
		// TODO Auto-generated method stub
		return bookDao.getNewTopBook();
	}
	
}

package com.crazybooks.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.crazybooks.base.impl.BookDaoImpl;
import com.crazybooks.biz.BookBiz;
import com.crazybooks.dao.HibernateSessionFactory;
import com.crazybooks.etity.Books;

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

	@Override
	public Books searchBook(Books book) {
		// TODO Auto-generated method stub
		return bookDao.getBookByBook(book);
	}

	@Override
	public List getComments(Books book) {
		// TODO Auto-generated method stub
		return bookDao.getBookComments(book);
	}
	
}

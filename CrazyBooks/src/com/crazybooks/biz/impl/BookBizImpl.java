package com.crazybooks.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.crazybooks.base.impl.BookDaoImpl;
import com.crazybooks.biz.BookBiz;
import com.crazybooks.dao.HibernateSessionFactory;
import com.crazybooks.etity.BookCartItem;
import com.crazybooks.etity.Books;
import com.crazybooks.utils.PageBean;

public class BookBizImpl implements BookBiz{
	BookDaoImpl bookDao;
	public void setBookDao(BookDaoImpl bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public PageBean<Books> findBooksByCid(int page,int id) {
		// TODO Auto-generated method stub
		PageBean<Books> pageBean=new PageBean<Books>();
		System.out.println("page is"+page);
		pageBean.setPage(page);
		int totalNum=bookDao.getTotalBooksNumByCid(id);
		int limit=9;
		int pageSize;
		if(totalNum%limit==0)
		{
			pageSize=totalNum/limit;
		}else{
			pageSize=totalNum/limit+1;
			System.out.println("pageSize:"+pageSize);
		}
		int begin=(page-1)*limit;
		pageBean.setPageSize(pageSize);
		List pList=bookDao.getBooksByCid(id,begin,limit);
		pageBean.setList(pList);
		return pageBean;
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

	public List findBooksByCoid(Integer coid) {
		// TODO Auto-generated method stub
		return bookDao.getBooksByCoid(coid);
	}

	public Books findBookByBid(int bid) {
		// TODO Auto-generated method stub
		return bookDao.getBookByBid(bid);
	}
	
}

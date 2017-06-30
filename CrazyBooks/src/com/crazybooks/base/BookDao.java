package com.crazybooks.base;

import java.util.List;

import com.crazybooks.etity.Books;

public interface BookDao {
	public List getBooksByCid(int id); //查询图书集合
	public Books getBookByBook(Books book); //获得单个图书信息
	public List getBookComments(Books book); //获得书籍的评论
}

package com.crazybooks.biz;

import java.util.List;

import com.crazybooks.etity.Books;

public interface BookBiz {
	public List findBooksByCid(int id);
	public Books searchBook(Books book); //通过例子查询来查询一本书的详细信息
	public List getComments(Books book);
}

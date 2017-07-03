package com.crazybooks.base;

import java.util.List;

import com.crazybooks.etity.Books;

public interface BookDao {
	public List getBooksByCid(int id, int begin, int limit); //鏌ヨ鍥句功闆嗗悎
	public Books getBookByBook(Books book); //鑾峰緱鍗曚釜鍥句功淇℃伅
	public List getBookComments(Books book); //鑾峰緱涔︾睄鐨勮瘎璁�
}

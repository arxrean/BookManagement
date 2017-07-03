package com.crazybooks.biz;

import java.util.List;

import com.crazybooks.etity.Books;
import com.crazybooks.utils.PageBean;

public interface BookBiz {
	public Books searchBook(Books book); //閫氳繃渚嬪瓙鏌ヨ鏉ユ煡璇竴鏈功鐨勮缁嗕俊鎭�
	public List getComments(Books book);
	PageBean<Books> findBooksByCid(int page, int id);
}

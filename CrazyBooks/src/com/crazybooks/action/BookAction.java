package com.crazybooks.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.crazybooks.biz.impl.BookBizImpl;
import com.crazybooks.etity.Books;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class BookAction extends ActionSupport implements ModelDriven<Books>{
	BookBizImpl bookService;
	
	private String result; //json 传值的变量
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setBookService(BookBizImpl bookService) {
		this.bookService = bookService;
	}
	
	Books book=new Books();
	
	public String findBooksByCid()
	{
		//System.out.println("----------------------------------------------------"+book.getId());
		List bList=bookService.findBooksByCid(book.getId());
		ActionContext.getContext().put("bList", bList);
		return "bookListPage";
	}
	
	@Override
	public Books getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	
	//获取图书的详细信息
	public String getBookInfo(){
		Books bookReal=bookService.searchBook(book);
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("id", bookReal.getId());
		map.put("name", bookReal.getName());
		map.put("picture", bookReal.getPicture());
		map.put("intro", bookReal.getIntro());
		map.put("author", bookReal.getAuthor());
		map.put("pubHouse", bookReal.getPubHouse());
		map.put("price", bookReal.getPrice());
		map.put("btime", bookReal.getBtime());
		map.put("categorytwo", bookReal.getCategorytwo());
		map.put("state", bookReal.getState());
		JSONObject json=null;
		try {
			json=JSONObject.fromObject(map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		result=json.toString();
		return "bookInfo";
	}
	
	//获取图书的评价
	public String getBookComments(){
		List comments=bookService.getComments(book);
		return "comments";
	}
}

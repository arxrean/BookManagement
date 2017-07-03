package com.crazybooks.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.crazybooks.biz.impl.BookBizImpl;
import com.crazybooks.etity.Books;
import com.crazybooks.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class BookAction extends ActionSupport implements ModelDriven<Books>{
	BookBizImpl bookService;
	Integer coid;
	int page;
	String search;
	public void setSearch(String search) {
		this.search = search;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setCoid(Integer coid) {
		this.coid = coid;
	}
	public Integer getCoid() {
		return coid;
	}
	Integer cid;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	private String result; //json 濞磋偐濮撮敓浠嬫儍閸曨偄缍侀梺璇ф嫹
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
		System.out.println("----------------------------------------------------page:"+page);
		PageBean<Books> pageBean=bookService.findBooksByCid(page,cid);
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "bookListPage";
	}
	public String findboosByCoid()
	{
		System.out.print("page is======"+page);
		PageBean<Books> pageBean=bookService.findBooksByCoid(page,coid);
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "bookListPage";
		
	}
	public String findBooksBySomething()
	{
		PageBean<Books> pageBean=bookService.findBooksBySomthing(page,search);
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "bookListPage";
	}
	@Override
	public Books getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	
	//闁兼儳鍢茶ぐ鍥炊閸欍儱濮涢柣銊ュ椤曟稓绱掗崱鏇氱箚闁诡叏鎷�
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
	
	//闁兼儳鍢茶ぐ鍥炊閸欍儱濮涢柣銊ュ閻﹀孩绂掗敓锟�
	public String getBookComments(){
		List comments=bookService.getComments(book);
		return "comments";
	}
}

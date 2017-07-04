package com.crazybooks.utils;

import java.util.Iterator;
import java.util.List;

public class KPageBean {
	private int currentPage;//当前页
	private int totalPages=0;//总页数
	private int pageRecords=5;//每页显示信息数
	private int totalRows=0;//总记录数
	private int pageStartRow=0;//每页的起始记录
	private int pageEndRow=0;//每页的终止记录数
	private boolean hasNextPage=false;
	private boolean hasPreviousPage=false;
	private List list;
	private Iterator it;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageRecords() {
		return pageRecords;
	}
	public void setPageRecords(int pageRecords) {
		this.pageRecords = pageRecords;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getPageStartRow() {
		return pageStartRow;
	}
	public void setPageStartRow(int pageStartRow) {
		this.pageStartRow = pageStartRow;
	}
	public int getPageEndRow() {
		return pageEndRow;
	}
	public void setPageEndRow(int pageEndRow) {
		this.pageEndRow = pageEndRow;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Iterator getIt() {
		return it;
	}
	public void setIt(Iterator it) {
		this.it = it;
	}
	
	public KPageBean(List list) {
		// TODO Auto-generated constructor stub
		setList(list);
		setTotalRows(list.size());
		setIt(list.iterator());
		setHasPreviousPage(false);
		setCurrentPage(1);
		//设置总的页数
		if(getTotalRows()%getPageRecords()==0){
			setTotalPages(getTotalRows()/getPageRecords());
		}
		else {
			setTotalPages(getTotalRows()/getPageRecords()+1);
		}
		//设置是否有下一页
		if(getCurrentPage()>=getTotalPages()){
			setHasNextPage(false);
		}
		else {
			setHasNextPage(true);
		}
		//当总数小于1页的时候
		if(getTotalRows()<getPageRecords()){
			setPageStartRow(0);
			setPageEndRow(getTotalRows());
		}
	}
}

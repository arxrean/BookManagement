package com.crazybooks.biz.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import com.crazybooks.base.AdminDao;
import com.crazybooks.base.impl.AdminDaoImpl;
import com.crazybooks.base.impl.UserDaoImpl;
import com.crazybooks.biz.AdminBiz;
import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;
import com.crazybooks.utils.PageBean;

public class AdminBizImpl implements AdminBiz{

	private AdminDao adi;
	
	@Override
	public JSONObject AdminLogin(Managers manager) {
		// TODO Auto-generated method stub
		adi=new AdminDaoImpl();
		return adi.AdminLogin(manager);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		adi=new AdminDaoImpl();
		return adi.getAllUsers();
	}

	@Override
	public PageBean<Users> getUsersWithCondition(Users user, int page) {
		// TODO Auto-generated method stub
		UserDaoImpl udi=new UserDaoImpl();
		PageBean<Users> pageBean=new PageBean<Users>();
		pageBean.setPage(page);
		List<Users> list=udi.getUsersWithCondition(user);
		int totalNum=list.size();
		int limit=8;
		int pageSize;
		if(totalNum%limit==0)
		{
			pageSize=totalNum/limit;
		}else{
			pageSize=totalNum/limit+1;
		}
		int begin=(page-1)*limit;
		List<Users> targetList=new ArrayList<Users>();
		if((begin+limit)>totalNum){
			for(int i=begin;i<totalNum;i++){
				targetList.add(list.get(i));
			}
		}
		else {
			for(int i=begin;i<begin+limit;i++){
				targetList.add(list.get(i));
			}
		}
		pageBean.setPageSize(pageSize);
		pageBean.setList(targetList);
		return pageBean;
	}


}

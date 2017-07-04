package com.crazybooks.biz.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import com.crazybooks.biz.UserBiz;
import com.crazybooks.base.impl.*;
import com.crazybooks.etity.Books;
import com.crazybooks.etity.Users;
import com.crazybooks.utils.PageBean;

public class UserBizImpl implements UserBiz{
	private UserDaoImpl userDaoImpl;
	@Override
	public boolean validateRegister(String registerName) {
		// TODO Auto-generated method stub
		userDaoImpl = new UserDaoImpl();
		return userDaoImpl.validateRegister(registerName);
	}

	@Override
	public void register(Users users) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		userDaoImpl.add(users);
	}

	@Override
	public String login(Users users) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		String result=userDaoImpl.validateLogin(users.getUserName(), users.getPassword());
		return result;
	}

	@Override
	public List getUser(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		List list=userDaoImpl.get(user);
		return list;
	}

	@Override
	public JSONObject getUserCollection(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		JSONObject json=userDaoImpl.getUserCollection(user);
		return json;
	}

	@Override
	public JSONObject getUserComments(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUserComments(user);
	}

	@Override
	public JSONObject getUserBorrow(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUserBorrow(user);
	}

	@Override
	public JSONObject getUserConsume(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUserConsume(user);
	}

	@Override
	public JSONObject addMoney(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.addMoney(user);
	}

	@Override
	public JSONObject alterPassword(Users user, String newPass) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.alterPass(user, newPass);
	}

	@Override
	public JSONObject alterUserInfo(Users user) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		return userDaoImpl.alterUserInfo(user);
	}

	@Override
	public PageBean<Users> getAllUsers(int page) {
		// TODO Auto-generated method stub
		userDaoImpl=new UserDaoImpl();
		PageBean<Users> pageBean=new PageBean<Users>();
		pageBean.setPage(page);
		List<Users> userList=userDaoImpl.getAllUsers();
		int totalNum=userList.size();
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
				targetList.add(userList.get(i));
			}
		}
		else {
			for(int i=begin;i<begin+limit;i++){
				targetList.add(userList.get(i));
			}
		}
		pageBean.setPageSize(pageSize);
		pageBean.setList(targetList);
		return pageBean;
	}
}

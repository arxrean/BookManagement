package com.crazybooks.biz.impl;

import java.util.List;

import net.sf.json.JSONObject;

import com.crazybooks.biz.UserBiz;
import com.crazybooks.base.impl.*;
import com.crazybooks.etity.Users;

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
}

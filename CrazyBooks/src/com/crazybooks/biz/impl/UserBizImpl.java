package com.crazybooks.biz.impl;

import java.util.List;

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
}

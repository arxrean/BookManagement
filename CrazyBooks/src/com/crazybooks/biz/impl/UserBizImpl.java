package com.crazybooks.biz.impl;

import com.crazybooks.biz.UserBiz;
import com.crazybooks.base.impl.*;
import com.crazybooks.etity.Users;

public class UserBizImpl implements UserBiz{

	@Override
	public boolean validateRegister(String registerName) {
		// TODO Auto-generated method stub
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.validateRegister(registerName);
	}

	@Override
	public void register(Users users) {
		// TODO Auto-generated method stub
		UserDaoImpl udi=new UserDaoImpl();
		udi.add(users);
	}

	@Override
	public String login(Users users) {
		// TODO Auto-generated method stub
		UserDaoImpl udi=new UserDaoImpl();
		String result=udi.validateLogin(users.getUserName(), users.getPassword());
		return result;
	}
	
}

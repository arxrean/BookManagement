package com.crazybooks.biz.impl;

import com.crazybooks.biz.UserBiz;
import com.crazybooks.base.impl.*;
import com.crazybooks.etity.Users;

public class UserBizImpl implements UserBiz{

	@Override
	public String validateLogin(String userName, String password) {
		// TODO Auto-generated method stub
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.validateLogin(userName, password);
	}

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
	
}

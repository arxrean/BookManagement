package com.crazybooks.biz.impl;

import com.crazybooks.biz.UserBiz;
import com.crazybooks.base.impl.*;

public class UserBizImpl implements UserBiz{

	@Override
	public boolean validateLogin(String userName, String password) {
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
	
}

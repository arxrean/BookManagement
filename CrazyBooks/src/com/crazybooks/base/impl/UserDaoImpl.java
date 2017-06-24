package com.crazybooks.base.impl;

import java.util.List;

import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.base.UserDao;
import com.crazybooks.etity.Users;

public class UserDaoImpl extends BaseHibernateDao implements UserDao{

	@Override
	public void add(Users users) {
		// TODO Auto-generated method stub
		super.add(users);
	}

	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		super.delete(users);
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		super.update(users);
	}

	@Override
	public Users get(int id) {
		// TODO Auto-generated method stub
		return (Users)super.get(Users.class, id);
	}

	@Override
	public boolean validateLogin(String loginName, String loginPwd) {//验证登录
		// TODO Auto-generated method stub
		boolean flag=false;
		Users condition=new Users();
		condition.setUserName(loginName);
		condition.setPassword(loginPwd);
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean validateRegister(String registerName) {//验证注册
		// TODO Auto-generated method stub
		boolean flag=false;
		Users condition=new Users();
		condition.setUserName(registerName);
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public void freeze(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFreeze() {
		// TODO Auto-generated method stub
		return false;
	}

	
}

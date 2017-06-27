package com.crazybooks.base.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.base.UserDao;
import com.crazybooks.dao.HibernateSessionFactory;
import com.crazybooks.etity.Freeze;
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
	public String validateLogin(String loginName, String loginPwd) {//验证登录
		// TODO Auto-generated method stub
		String flag="none";
		Users condition=new Users();
		condition.setUserName(loginName);
		condition.setPassword(loginPwd);
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			Freeze conditionFreeze=new Freeze();
			conditionFreeze.setUid(((Users)list.get(0)).getId());
			List list2=super.search(Freeze.class, conditionFreeze);
			if(list2.size()>0){
				flag="freeze";
			}
			else {
				flag="success";
			}
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
	public boolean isFreeze(int userId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Freeze condition=new Freeze();
		condition.setUid(userId);
		List list=super.search(Freeze.class, condition);
		if(list.size()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public void register(Users users) {
		// TODO Auto-generated method stub
		add(users);
	}

	
}

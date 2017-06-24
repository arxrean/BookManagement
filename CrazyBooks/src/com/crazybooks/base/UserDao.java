package com.crazybooks.base;

import com.crazybooks.etity.Users;


public interface UserDao {
	public void add(Users users);
	public void delete(Users users);
	public void update(Users users);
	public Users get(int id);
	public boolean validateLogin(String loginName,String loginPwd);//验证登录
	public boolean validateRegister(String registerName);//验证注册
	public void register(Users users);
	public void freeze(int id);
	public boolean isFreeze(int id);
}

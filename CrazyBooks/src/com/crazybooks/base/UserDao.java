package com.crazybooks.base;

import java.util.List;

import com.crazybooks.etity.Users;


public interface UserDao {
	public void add(Users users);
	public void delete(Users users);
	public void update(Users users);
	public Users get(int id); //根据id找到用户
	public List get(Users user);//根据用户类型找到用户
	public String validateLogin(String loginName,String loginPwd);//验证登录
	public boolean validateRegister(String registerName);//验证注册
	public void register(Users users);
	public boolean isFreeze(int id);
}

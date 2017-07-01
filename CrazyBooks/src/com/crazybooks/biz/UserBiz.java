package com.crazybooks.biz;

import java.util.List;

import com.crazybooks.etity.Users;

public interface UserBiz {
	public boolean validateRegister(String registerName); //验证注册
	public void register(Users users); //注册
	public String login(Users users);
	public List getUser(Users user);
}

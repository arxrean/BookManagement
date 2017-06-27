package com.crazybooks.biz;

import com.crazybooks.etity.Users;

public interface UserBiz {
	public boolean validateRegister(String registerName); //验证注册
	public void register(Users users); //注册
	public String login(Users users);
}

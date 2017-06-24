package com.crazybooks.biz;

public interface UserBiz {
	public boolean validateLogin(String userName, String password);
	public boolean validateRegister(String registerName);
}

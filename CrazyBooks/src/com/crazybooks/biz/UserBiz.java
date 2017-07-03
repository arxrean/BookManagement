package com.crazybooks.biz;

import java.util.List;

import net.sf.json.JSONObject;

import com.crazybooks.etity.Users;

public interface UserBiz {
	public boolean validateRegister(String registerName); //验证注册
	public void register(Users users); //注册
	public String login(Users users);
	public List getUser(Users user);
	public JSONObject getUserCollection(Users user);//获得用户的收藏
	public JSONObject getUserComments(Users user);//获得用户的评论
	public JSONObject getUserBorrow(Users user);//获得用户借阅信息
	public JSONObject getUserConsume(Users user);
	public JSONObject addMoney(Users user);
	public JSONObject alterPassword(Users user,String newPass);
	public JSONObject alterUserInfo(Users user);
}

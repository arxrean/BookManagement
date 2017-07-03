package com.crazybooks.base;

import java.util.List;

import net.sf.json.JSONObject;

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
	public JSONObject getUserCollection(Users user);//获得用户收藏
	public JSONObject getUserComments(Users user);//获得用户评论
	public JSONObject getUserBorrow(Users user);//获得用户借阅信息
	public JSONObject getUserConsume(Users user);//获得用户的消费记录
	public JSONObject addMoney(Users user);
	public JSONObject alterPass(Users user,String newPass);
	public JSONObject alterUserInfo(Users user);
}

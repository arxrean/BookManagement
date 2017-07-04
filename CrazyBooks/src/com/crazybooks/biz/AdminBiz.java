package com.crazybooks.biz;

import java.util.List;

import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;

import net.sf.json.JSONObject;

public interface AdminBiz {
	public JSONObject AdminLogin(Managers manager);
	public List<Users> getAllUsers();
}

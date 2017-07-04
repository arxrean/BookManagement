package com.crazybooks.base;

import java.util.List;

import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;

import net.sf.json.JSONObject;

public interface AdminDao {
	public JSONObject AdminLogin(Managers manager);
	public List<Users> getAllUsers();
}

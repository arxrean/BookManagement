package com.crazybooks.base;

import com.crazybooks.etity.Managers;

import net.sf.json.JSONObject;

public interface AdminDao {
	public JSONObject AdminLogin(Managers manager);
}

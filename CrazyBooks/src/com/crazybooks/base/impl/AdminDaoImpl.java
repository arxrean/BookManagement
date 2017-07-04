package com.crazybooks.base.impl;

import java.util.List;

import net.sf.json.JSONObject;

import com.crazybooks.base.AdminDao;
import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;

public class AdminDaoImpl extends BaseHibernateDao implements AdminDao{

	@Override
	public JSONObject AdminLogin(Managers manager) {
		// TODO Auto-generated method stub
		JSONObject json=new JSONObject();
		List list=super.search(Managers.class, manager);
		if(list.size()>0){
			json.put("result", "success");
		}
		else {
			json.put("result", "error");
		}
		return json;
	}

}

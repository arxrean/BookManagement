package com.crazybooks.action;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.crazybooks.biz.impl.UserBizImpl;
import com.crazybooks.etity.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Users>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Users users;
	
	private String result;
	
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return users;
	}

	public String Login(){
		return SUCCESS;
	}
	
	//验证用户名是否已经被注册
	public String ValidateRegister(){
		UserBizImpl ubi=new UserBizImpl();
		if(ubi.validateRegister(users.getName())){
			Map<String, Object> map =new HashMap<String, Object>();
			map.put("type", "error");
			map.put("des", "该用户名已经被注册!");
			JSONObject json=JSONObject.fromObject(map);
			result=json.toString();
		}
		else {
			Map<String, Object> map =new HashMap<String, Object>();
			map.put("type", "success");
			map.put("des", "null");
			JSONObject json=JSONObject.fromObject(map);
			result=json.toString();
		}
		return "valiRegi";
	}
}

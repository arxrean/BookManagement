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
		if(users==null){
			users=new Users();
		}
		return users;
	}

	public String Login(){
		UserBizImpl ubi=new UserBizImpl();
		Map<String, Object> map =new HashMap<String, Object>();
		if(ubi.validateLogin(users.getUserName(),users.getPassword()).equals("success")){
			
		}
		return SUCCESS;
	}
	
	//楠岃瘉鐢ㄦ埛鍚嶆槸鍚﹀凡缁忚娉ㄥ唽
	public String ValidateRegister(){
		UserBizImpl ubi=new UserBizImpl();
		if(ubi.validateRegister(users.getUserName())){
			Map<String, Object> map =new HashMap<String, Object>();
			map.put("type", "error");
			map.put("des", "already has this userName!");
			JSONObject json=JSONObject.fromObject(map);
			result=json.toString();
		}
		else {
			Map<String, Object> map =new HashMap<String, Object>();
			map.put("type", "success");
			map.put("des", "userName is ok!");
			JSONObject json=null;
			try {
				json=JSONObject.fromObject(map);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			result=json.toString();
		}
		return "valiRegi";
	}
	
	//娉ㄥ唽鐢ㄦ埛
	public String Register(){
		UserBizImpl ubi=new UserBizImpl();
		Map<String, Object> map =new HashMap<String, Object>();
		ubi.register(users);
		map.put("type", "success");
		JSONObject json=JSONObject.fromObject(map);
		result=json.toString();
		return "register";
	}
}

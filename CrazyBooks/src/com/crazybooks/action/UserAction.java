package com.crazybooks.action;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import net.sf.json.JSONObject;

import com.crazybooks.biz.impl.UserBizImpl;
import com.crazybooks.etity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Users>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Users users;
	
	private String result;
	
	private String rand;//验证码
	
	

	public String getRand() {
		return rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
	}

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
		Map<String, Object> map =new HashMap<String, Object>();
		String random=(String)(ActionContext.getContext().getSession().get("validateCode"));
		if(random.equals(this.rand)){
			UserBizImpl ubi=new UserBizImpl();
			System.out.println(users.getUserName()+" "+users.getPassword());
			String loginResult=ubi.login(users);
			if(loginResult.equals("success")){
				map.put("type", "success");
				ActionContext.getContext().getSession().put("userName", users.getUserName());
			}
			else if(loginResult.equals("freeze")){
				map.put("type", "freeze");
			}
			else {
				map.put("type", "none");
			}
		}
		else {
			map.put("type", "codeError");
		}	
		JSONObject json=JSONObject.fromObject(map);
		result=json.toString();
		return "login";
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
		String random=(String)(ActionContext.getContext().getSession().get("validateCode"));
		if(random.equals(rand)){
			System.out.println("yes");
			ubi.register(users);
			map.put("type", "success");
		}
		else {
			System.out.println("no");
			map.put("type", "validateError");
		}
		JSONObject json=JSONObject.fromObject(map);
		result=json.toString();
		return "register";
	}
}

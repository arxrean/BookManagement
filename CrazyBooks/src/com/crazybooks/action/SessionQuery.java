package com.crazybooks.action;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SessionQuery extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sessionType;
	
	private String result;
	
	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String execute() throws Exception {
		Map<String, Object> map =new HashMap<String, Object>();
		// TODO Auto-generated method stub
		if(sessionType.equals("userName")){
			if(ActionContext.getContext().getSession().get(sessionType) != null){
				String session=(String)(ActionContext.getContext().getSession().get(sessionType));
				map.put("sessionType", session);
			}
			else {
				map.put("sessionType", "none");
			}
		}
		else if(sessionType.equals("deleteUserName")){
			ActionContext.getContext().getSession().remove("userName");
			map.put("sessionType", "deleteUserName");
		}
		JSONObject json=JSONObject.fromObject(map);
		result=json.toString();
		return "session";
	}
	
}

package com.crazybooks.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.crazybooks.base.AdminDao;
import com.crazybooks.biz.AdminBiz;
import com.crazybooks.biz.impl.AdminBizImpl;
import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven<Managers> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Managers manager;

	private AdminBiz ab;

	private String result;

	private String rand;

	public String getRand() {
		return rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
	}

	public Managers getManager() {
		return manager;
	}

	public void setManager(Managers manager) {
		this.manager = manager;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public Managers getModel() {
		// TODO Auto-generated method stub
		if (manager == null) {
			manager = new Managers();
		}
		return manager;
	}

	public String Login() {
		JSONObject json = new JSONObject();
		System.out.println(manager.getName()+":"+manager.getPassword());
		String random = (String) (ActionContext.getContext().getSession()
				.get("validateCode"));
		if (random.equals(rand)) {
			ab = new AdminBizImpl();
			json = ab.AdminLogin(manager);
			if (json.get("result").equals("success")) {
				ActionContext.getContext().getSession()
						.put("adminName", manager.getName());
			}
		} else {
			json.put("result", "validateError");
		}
		result = json.toString();
		return "AdminLogin";
	}

	public String DeleteSession(){
		ActionContext.getContext().getSession().remove("adminName");
		return "returnLogin";
	}
	
	public String ViewUsers(){
		List<Users> list=ab.getAllUsers();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("users", list);
		return "ViewUsers";
	}
}

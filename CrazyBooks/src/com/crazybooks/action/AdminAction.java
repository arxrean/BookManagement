package com.crazybooks.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.crazybooks.base.AdminDao;
import com.crazybooks.biz.AdminBiz;
import com.crazybooks.biz.impl.AdminBizImpl;
import com.crazybooks.biz.impl.UserBizImpl;
import com.crazybooks.etity.Managers;
import com.crazybooks.etity.Users;
import com.crazybooks.utils.PageBean;
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

	private String result;//json结果

	private String rand; //验证码
	
	private int page; //请求的页数
	
	private Users user=new Users(); 
	
	private String searchContent;//搜索框内输入的值
	
	private String searchType;//搜索特定属性
	
	

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchContent() {
		return searchContent;
	}

	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

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
	
	//查看所有用户
	public String ViewUsers(){
		UserBizImpl ubi=new UserBizImpl();
		PageBean<Users> pageBean=ubi.getAllUsers(page);
		System.out.println(pageBean.getList().size());
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("users", pageBean);
		return "ViewUsers";
	}
	
	//查看指定条件的用户
	public String SearchUsers(){
		AdminBiz adminBiz=new AdminBizImpl();
		if(searchType.equals("userName")){
			user.setUserName(searchContent);
		}
		if(searchType.equals("sex")){
			user.setSex(Integer.parseInt(searchContent));
		}
		if(searchType.equals("balance")){
			user.setBalance(Float.parseFloat(searchContent));
		}
		if(searchType.equals("idnum")){
			user.setIdnum(searchContent);
		}
		if(searchType.equals("name")){
			user.setName(searchContent);
		}
		if(searchType.equals("email")){
			user.setEmail(searchContent);
		}
		if(searchType.equals("address")){
			user.setAddress(searchContent);
		}
		if(searchType.equals("rank")){
			user.setRank(Integer.parseInt(searchContent));
		}
		if(searchType.equals("score")){
			user.setScore(Integer.parseInt(searchContent));
		}
		if(searchType.equals("phoneNum")){
			user.setPhoneNum(searchContent);
		}
		PageBean<Users> pageBean=adminBiz.getUsersWithCondition(user, page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("users", pageBean);
		return "ViewUsersCondition";
	}
}

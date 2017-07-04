package com.crazybooks.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import net.sf.json.JSONObject;

import com.crazybooks.biz.impl.UserBizImpl;
import com.crazybooks.etity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Users> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Users users;

	private String result;

	private String rand;// 验证码

	private UserBizImpl ubi;

	private String newPassword;// 新密码

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

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
		if (users == null) {
			users = new Users();
		}
		return users;
	}

	public String Login() {
		Map<String, Object> map = new HashMap<String, Object>();
		String random = (String) (ActionContext.getContext().getSession()
				.get("validateCode"));
		if (random.equals(this.rand)) {
			ubi = new UserBizImpl();
			String loginResult = ubi.login(users);
			if (loginResult.equals("success")) {
				map.put("type", "success");
				ActionContext.getContext().getSession()
						.put("userName", users.getUserName());
			} else if (loginResult.equals("freeze")) {
				map.put("type", "freeze");
			} else {
				map.put("type", "none");
			}
		} else {
			map.put("type", "codeError");
		}
		JSONObject json = JSONObject.fromObject(map);
		result = json.toString();
		return "login";
	}

	// 楠岃瘉鐢ㄦ埛鍚嶆槸鍚﹀凡缁忚娉ㄥ唽
	public String ValidateRegister() {
		ubi = new UserBizImpl();
		if (ubi.validateRegister(users.getUserName())) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("type", "error");
			map.put("des", "already has this userName!");
			JSONObject json = JSONObject.fromObject(map);
			result = json.toString();
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("type", "success");
			map.put("des", "userName is ok!");
			JSONObject json = null;
			try {
				json = JSONObject.fromObject(map);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			result = json.toString();
		}
		return "valiRegi";
	}

	// 娉ㄥ唽鐢ㄦ埛
	public String Register() {
		ubi = new UserBizImpl();
		Map<String, Object> map = new HashMap<String, Object>();
		String random = (String) (ActionContext.getContext().getSession()
				.get("validateCode"));
		if (random.equals(rand)) {
			System.out.println("yes");
			ubi.register(users);
			map.put("type", "success");
		} else {
			System.out.println("no");
			map.put("type", "validateError");
		}
		JSONObject json = JSONObject.fromObject(map);
		result = json.toString();
		return "register";
	}

	public String getUserInfo() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		Users user = new Users();
		user.setUserName(userName);
		List list = ubi.getUser(user);
		Users userTarget = (Users) list.get(0);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", userTarget.getUserName());
		map.put("idCard", userTarget.getIdnum());
		map.put("name", userTarget.getName());
		map.put("sex", userTarget.getSex());
		map.put("balance", userTarget.getBalance());
		map.put("address", userTarget.getAddress());
		map.put("email", userTarget.getEmail());
		map.put("scores", userTarget.getScore());
		map.put("rank", userTarget.getRank());
		map.put("phone", userTarget.getPhoneNum());
		map.put("image", userTarget.getImage());
		JSONObject json = JSONObject.fromObject(map);
		result = json.toString();
		return "getUserInfo";
	}

	public String getUserCollection() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		Users user = new Users();
		user.setUserName(userName);
		JSONObject json = ubi.getUserCollection(user);
		result = json.toString();
		return "userCollection";
	}

	public String getUserComments() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		Users user = new Users();
		user.setUserName(userName);
		JSONObject json = ubi.getUserComments(user);
		result = json.toString();
		return "userComments";
	}

	public String getUserBorrow() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		Users user = new Users();
		user.setUserName(userName);
		JSONObject json = ubi.getUserBorrow(user);
		result = json.toString();
		return "userBorrow";
	}

	// obtain consume records
	public String getUserConsume() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		Users user = new Users();
		user.setUserName(userName);
		JSONObject json = ubi.getUserConsume(user);
		result = json.toString();
		return "userConsume";
	}

	public String addMoney() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		String random = (String) (ActionContext.getContext().getSession()
				.get("validateCode"));
		JSONObject json = new JSONObject();
		if (random.equals(rand)) {
			Users user = new Users();
			user.setUserName(userName);
			user.setBalance(users.getBalance());
			json = ubi.addMoney(user);
		} else {
			System.out.println("no");
			json.put("type", "validateError");
		}
		result = json.toString();
		return "addMoney";
	}

	public String alterPassword() {
		ubi = new UserBizImpl();
		String userName = (String) (ActionContext.getContext().getSession()
				.get("userName"));
		JSONObject json = new JSONObject();
		Users user = new Users();
		user.setUserName(userName);
		user.setPassword(users.getPassword());
		json = ubi.alterPassword(user, newPassword);
		result = json.toString();
		return "alterPass";
	}

	public String alterUserInfo() {
		ubi = new UserBizImpl();
		JSONObject json = ubi.alterUserInfo(users);
		result = json.toString();
		return "userAlterInfo";
	}
}

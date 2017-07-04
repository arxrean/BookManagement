package com.crazybooks.base.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crazybooks.base.BaseHibernateDao;
import com.crazybooks.base.UserDao;
import com.crazybooks.dao.HibernateSessionFactory;
import com.crazybooks.etity.Books;
import com.crazybooks.etity.Borrow;
import com.crazybooks.etity.Collections;
import com.crazybooks.etity.Commentary;
import com.crazybooks.etity.Freeze;
import com.crazybooks.etity.Recharge;
import com.crazybooks.etity.Users;

public class UserDaoImpl extends BaseHibernateDao implements UserDao{

	@Override
	public void add(Users users) {
		// TODO Auto-generated method stub
		super.add(users);
	}
	
	public void addBorrow(Borrow borrow){
		super.add(borrow);
	}

	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		super.delete(users);
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		super.update(users);
	}

	@Override
	public Users get(int id) {
		// TODO Auto-generated method stub
		return (Users)super.get(Users.class, id);
	}

	@Override
	public String validateLogin(String loginName, String loginPwd) {//验证登录
		// TODO Auto-generated method stub
		String flag="none";
		Users condition=new Users();
		condition.setUserName(loginName);
		condition.setPassword(loginPwd);
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			Freeze conditionFreeze=new Freeze();
			conditionFreeze.setUsers(((Users)list.get(0)));
			List list2=super.search(Freeze.class, conditionFreeze);
			if(list2.size()>0){
				flag="freeze";
			}
			else {
				flag="success";
			}
		}
		return flag;
	}

	@Override
	public boolean validateRegister(String registerName) {//验证注册
		// TODO Auto-generated method stub
		boolean flag=false;
		Users condition=new Users();
		condition.setUserName(registerName);
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean isFreeze(int userId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Freeze condition=new Freeze();
		condition.getUsers().setId(userId);
		List list=super.search(Freeze.class, condition);
		if(list.size()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public void register(Users users) {
		// TODO Auto-generated method stub
		add(users);
	}

	@Override
	public List get(Users user) {
		// TODO Auto-generated method stub
		List list=super.search(Users.class, user);
		return list;
	}

	@Override
	public JSONObject getUserCollection(Users user) {
		// TODO Auto-generated method stub
		Map<String, Object> map =new HashMap<String, Object>();
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		try {
			Query query=session.createQuery("from Users u,Collections c,Books b where u.id=c.users and c.books=b.id and u.userName=?");
			query.setString(0, user.getUserName());
			List<Object[]> list=query.list();
			for(Object[] objects: list){
				JSONObject jsonSingle=new JSONObject();
				Books book=(Books)objects[2];
				jsonSingle.put("bookName", book.getName());
				jsonSingle.put("bookAuthor", book.getAuthor());
				jsonSingle.put("bookPublisher", book.getPubHouse());
				json.put(book.getId(), jsonSingle);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject getUserComments(Users user) {
		// TODO Auto-generated method stub
		Map<String, Object> map =new HashMap<String, Object>();
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		try {
			Query query=session.createQuery("from Users u,Commentary c,Books b where u.id=c.users and c.books=b.id and u.userName=?");
			query.setString(0, user.getUserName());
			List<Object[]> list=query.list();
			for(Object[] objects: list){
				JSONObject jsonSingle=new JSONObject();
				Commentary commentary=(Commentary)objects[1];
				Books book=(Books)objects[2];
				jsonSingle.put("bookName", book.getName());
				jsonSingle.put("comment", commentary.getCommentary());
				jsonSingle.put("commentTime", commentary.getCommentTime().toString());
				json.put(commentary.getId(), jsonSingle);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject getUserBorrow(Users user) {
		// TODO Auto-generated method stub
		Map<String, Object> map =new HashMap<String, Object>();
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		try {
			Query query=session.createQuery("from Users u,Borrow w,Books b where u.id=w.users and w.books=b.id and u.userName=?");
			query.setString(0, user.getUserName());
			List<Object[]> list=query.list();
			for(Object[] objects: list){
				JSONObject jsonSingle=new JSONObject();
				Borrow borrow=(Borrow)objects[1];
				Books book=(Books)objects[2];
				jsonSingle.put("bookName", book.getName());
				jsonSingle.put("bookAuthor", book.getAuthor());
				jsonSingle.put("bookPublisher", book.getPubHouse());
				jsonSingle.put("borrowTime", borrow.getBorrowTime().toString());
				jsonSingle.put("deadline", borrow.getDeadline().toString());
				if(borrow.getReturnTime()==null){
					jsonSingle.put("returnTime", null);
				}
				else {
					jsonSingle.put("returnTime", borrow.getReturnTime().toString());
				}
				jsonSingle.put("borrowConsume", borrow.getConsumption());
				json.put(borrow.getId(), jsonSingle);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject getUserConsume(Users user) {
		// TODO Auto-generated method stub
		Map<String, Object> map =new HashMap<String, Object>();
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		try {
			//查询借阅记录
			Query query=session.createQuery("from Users u,Borrow w,Books b where u.id=w.users and w.books=b.id and u.userName=?");
			query.setString(0, user.getUserName());
			List<Object[]> list=query.list();
			for(Object[] objects: list){
				JSONObject jsonSingle=new JSONObject();
				Borrow borrow=(Borrow)objects[1];
				if(borrow.getReturnTime()!= null){
					jsonSingle.put("type", "借阅");
					jsonSingle.put("time", borrow.getReturnTime().toString());
					jsonSingle.put("money", "-"+borrow.getConsumption());
					json.put("borrow"+borrow.getId(), jsonSingle);
				}
			}
			
			//查询充值记录
			Query query2=session.createQuery("from Users u,Recharge r where u.id=r.users and u.userName=?");
			query2.setString(0, user.getUserName());
			List<Object[]> list2=query2.list();
			for(Object[] objects: list2){
				JSONObject jsonSingle=new JSONObject();
				Recharge recharge=(Recharge)objects[1];
				jsonSingle.put("type", "充值");
				jsonSingle.put("time", recharge.getRechargeTime().toString());
				jsonSingle.put("money", "+"+recharge.getAmount());
				json.put("recharge"+recharge.getId(), jsonSingle);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject addMoney(Users user) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		try {
			Transaction trans=session.beginTransaction();
			Query query=session.createQuery("update Users u set u.balance=?+u.balance where u.userName=?");
			query.setFloat(0, user.getBalance());
			query.setString(1, user.getUserName());
			int result=query.executeUpdate();
			trans.commit();
			if(result>0){
				json.put("type", "success");
			}
			else {
				json.put("type", "error");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject alterPass(Users user, String newPass) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		JSONObject json=new JSONObject();
		Users condition=new Users();
		condition.setUserName(user.getUserName());
		condition.setPassword(user.getPassword());
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			Users alterUser=(Users)list.get(0);
			try {
				Session session2=HibernateSessionFactory.getSession();
				Transaction trans=session2.beginTransaction();
				Query query=session2.createQuery("update Users u set u.password=? where u.userName=?");
				query.setString(0, newPass);
				query.setString(1, alterUser.getUserName());
				int result=query.executeUpdate();
				trans.commit();
				if(result>0){
					System.out.println("resultok");
					json.put("type", "success");
				}
				else {
					json.put("type", "error");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else {
			json.put("type", "originError");
		}
		return json;
	}

	@Override
	public JSONObject alterUserInfo(Users user) {
		// TODO Auto-generated method stub
		Users condition=new Users();
		condition.setUserName(user.getUserName());
		List list=super.search(Users.class, condition);
		Users targetUser=(Users)list.get(0);
		targetUser.setName(user.getName());
		targetUser.setSex(user.getSex());
		targetUser.setAddress(user.getAddress());
		targetUser.setPhoneNum(user.getPhoneNum());
		targetUser.setEmail(user.getEmail());
		update(targetUser);
		JSONObject json=new JSONObject();
		json.put("type", "success");
		return json;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		List<Users> userList=new ArrayList<Users>();
		Session session=HibernateSessionFactory.getSession();
		try {
			Query query=session.createQuery("from Users");
			userList=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public List<Users> getUsersWithCondition(Users user) {
		// TODO Auto-generated method stub
		List<Users> list=super.search(Users.class, user);
		return list;
	}
	
	public String insertIntoCollection(Users user,Books book){
		try {
			Users targetUser=(Users)super.search(Users.class, user).get(0);
			Books targetBook=new Books();
			targetBook.setId(book.getId());
			targetBook.setAuthor(book.getAuthor());
			targetBook.setName(book.getName());
			targetBook.setPicture(book.getPicture());
			Borrow borrow=new Borrow();
			borrow.setUsers(targetUser);
			borrow.setBooks(targetBook);
			addBorrow(borrow);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "success";
	}
	
}

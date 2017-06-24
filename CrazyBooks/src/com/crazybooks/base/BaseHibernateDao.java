package com.crazybooks.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.crazybooks.dao.HibernateSessionFactory;


public class BaseHibernateDao {
	protected void add(Object object) {
		Transaction tran = null;
		Session session = HibernateSessionFactory.getSession();

		try {
			tran = session.beginTransaction();
			session.save(object);
			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		}
	}

	protected Object get(Class cla, Serializable id) {
		Object object = null;
		Session session = HibernateSessionFactory.getSession();
		try {
			object = session.get(cla, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return object;
	}

	protected void delete(Object object) {
		Transaction tran = null;
		Session session = HibernateSessionFactory.getSession();
		try {
			tran = session.beginTransaction();
			session.delete(object);
			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	protected void update(Object object) {
		Transaction tran = null;
		Session session = HibernateSessionFactory.getSession();
		try {
			tran = session.beginTransaction();
			session.update(object);
			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	protected List search(Class cla, Object condition) {
		Session session = null;
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			list = session.createCriteria(cla).add(Example.create(condition))
					.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return list;
	}
}

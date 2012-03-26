package com.chandankumar.sprhib.dao.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import com.chandankumar.sprhib.dao.GenericDao;

public class GenericDaoHibernate<T, PK extends Serializable> implements
		GenericDao<T, PK> {
	@Autowired(required = true)
	private SessionFactory sessionFactory;

	private Class<T> type;

	public GenericDaoHibernate(Class<T> type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	public PK create(T o) {
		return (PK) getSession().save(o);
	}

	@SuppressWarnings("unchecked")
	public T findById(PK id) {
		return (T) getSession().get(type, id);
	}

	public T save(T o) {
		getSession().saveOrUpdate(o);
		return o;

	}

	public void delete(T o) {
		getSession().delete(o);
	}

	public Session getSession() {
		return SessionFactoryUtils.getSession(sessionFactory, true);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
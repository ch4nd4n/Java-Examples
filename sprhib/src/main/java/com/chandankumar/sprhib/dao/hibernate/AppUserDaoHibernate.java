package com.chandankumar.sprhib.dao.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.chandankumar.sprhib.dao.AppUserDao;
import com.chandankumar.sprhib.model.AppUser;

@Repository
public class AppUserDaoHibernate extends GenericDaoHibernate<AppUser, Long> implements AppUserDao{
	protected final Log logger = LogFactory.getLog(getClass());
	
	public AppUserDaoHibernate(){super(AppUser.class);}
	
	public AppUserDaoHibernate(AppUser type){
		super(AppUser.class);
	}
}

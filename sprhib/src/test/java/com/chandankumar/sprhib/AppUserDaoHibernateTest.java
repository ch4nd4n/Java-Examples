package com.chandankumar.sprhib;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chandankumar.sprhib.dao.AppUserDao;
import com.chandankumar.sprhib.model.AppUser;

public class AppUserDaoHibernateTest extends AbstractDaoTest{

	@Autowired
	private AppUserDao appUserDao;
	@Test
	public void testCreateAndFindById() {
		AppUser appUser = new AppUser();
		appUser.setName("Junit test");
		appUser = appUserDao.save(appUser);
		Long id = appUser.getId();
		Assert.assertNotNull(id);
		logger.debug(id);
		appUser = null;
		appUser = appUserDao.findById(id);
		Assert.assertNotNull(appUser);
	}
}

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
	public void testCreate() {
		AppUser appUser = new AppUser();
		appUser.setName("Junit test");
		appUser = appUserDao.save(appUser);
		Assert.assertNotNull(appUser.getId());
		logger.debug(appUser.getId());
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}

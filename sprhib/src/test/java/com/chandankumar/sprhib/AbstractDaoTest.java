/*
 * (c) UberMedia.
 *
 */
package com.chandankumar.sprhib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author ckumar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public abstract class AbstractDaoTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	protected final Log logger = LogFactory.getLog(getClass());
}
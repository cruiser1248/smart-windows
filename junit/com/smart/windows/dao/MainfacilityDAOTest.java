package com.smart.windows.dao;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.windows.po.Familyadmin;
import com.smart.windows.po.Mainfacility;

public class MainfacilityDAOTest {

	SessionFactory sf = null;
	Session session = null;
	Transaction tran = null;
	MainfacilityDAO mainfacilityDAO = null;
	Mainfacility transientInstance = new Mainfacility();

	@Before
	public void before() {

		String source = "applicationContext.xml";// 配置文件的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		mainfacilityDAO = (MainfacilityDAO) ac.getBean("MainfacilityDAO");// 参数是dao在配置文件bean的id

	}

	@Test
	public void save() {
		// fail("Not yet implemented");

		transientInstance.setName("cruiser's facility");
		transientInstance.setStatus("在线");
		transientInstance.setMainFaclityId(100000002);
		transientInstance.setFamilyadmin(new Familyadmin("cc", "cc", "在线", 112,
				"河南"));

		mainfacilityDAO.save(transientInstance);

		System.out.println("save:");

	}

	@Test
	public void findById() {
		// fail("Not yet implemented");

		transientInstance = mainfacilityDAO.findById(11111111);

		System.out.println("transientInstance.getName():"
				+ transientInstance.getName());

	}

	@Test
	public void test() {
		// fail("Not yet implemented");

		String source = "applicationContext.xml";// 配置文件的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		mainfacilityDAO = (MainfacilityDAO) ac.getBean("MainfacilityDAO");// 参数是dao在配置文件bean的id

		System.out.println("test");

	}

}

package com.smart.windows.dao;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.staticmock.AbstractMethodMockingControl.Expectations;

import com.smart.windows.po.Familyadmin;
import com.smart.windows.po.Mainfacility;

public class MainfacilityDAOTest {

	SessionFactory sf = null;
	Session session = null;
	Transaction tran = null;
	FamilyadminDAO familyadminDao = null;
	Familyadmin familyadmin = null;
	MainfacilityDAO mainfacilityDAO = null;
	Mainfacility transientInstance = new Mainfacility();

	@Before
	public void before() {

		String source = "applicationContext.xml";// 配置文件的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		// mainfacilityDAO = (MainfacilityDAO) ac.getBean("MainfacilityDAO");//
		// 参数是dao在配置文件bean的id
		mainfacilityDAO = MainfacilityDAO.getFromApplicationContext(ac);
		// familyadminDao = (FamilyadminDAO) ac.getBean("FamilyadminDAO");//
		// 参数是dao在配置文件bean的id
		familyadminDao = FamilyadminDAO.getFromApplicationContext(ac);
	}

	@Test
	public void save() {//增加
		// fail("Not yet implemented");

		// familyadmin = familyadminDao.findById(10000000);
		//
		// System.out.println(familyadmin.getFamilyAdminId());

		transientInstance.setPhysicalId(123455);
		transientInstance.setName("cruiser's facility");
		transientInstance.setStatus("online");

		try {
			mainfacilityDAO.save(transientInstance);
			System.out.println("save successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void delete() {//删
		// fail("Not yet implemented");

		transientInstance = new Mainfacility();
		transientInstance.setMainFaclityId(14);
		transientInstance.setPhysicalId(123455);
		transientInstance.setName("cruiser's facility");
		transientInstance.setStatus("online");

		try {
			mainfacilityDAO.delete(transientInstance);
			System.out.println("delete successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void merge() {//改
		// fail("Not yet implemented");
		transientInstance = new Mainfacility();
		transientInstance.setMainFaclityId(16);
		transientInstance.setPhysicalId(1010);
		transientInstance.setName("cruiser's facility123");
		transientInstance.setStatus("online");

		try {
			mainfacilityDAO.merge(transientInstance);
			System.out.println("merge successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void findById() {//查
		// fail("Not yet implemented");

		transientInstance = (Mainfacility) mainfacilityDAO.findById(
				19);

		System.out.println("transientInstance.getName():"
				+ transientInstance.getName());

	}
	@Test
	public void findByExample() {//查
		// fail("Not yet implemented");
		
		transientInstance.setName("cruiser's facility123");
		transientInstance.setStatus("null");
		transientInstance = new Mainfacility();
		transientInstance = (Mainfacility) mainfacilityDAO.findByExample(transientInstance);

		System.out.println("transientInstance.getName():"
				+ transientInstance.getName());

	}
	@Test
	public void findByPhysicalId() {//查
		// fail("Not yet implemented");
		transientInstance = new Mainfacility();
		transientInstance = (Mainfacility) mainfacilityDAO.findByPhysicalId(
				123455).get(0);

		System.out.println("transientInstance.getName():"
				+ transientInstance.getName());

	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		//
		// String source = "applicationContext.xml";// 配置文件的路径
		// ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		// mainfacilityDAO = (MainfacilityDAO) ac.getBean("MainfacilityDAO");//
		// 参数是dao在配置文件bean的id

		System.out.println("test");

	}

}

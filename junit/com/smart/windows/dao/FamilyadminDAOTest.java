package com.smart.windows.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.windows.po.Familyadmin;

public class FamilyadminDAOTest {

	FamilyadminDAO familyadminDao = null;
	Familyadmin familyadmin = null;

	@Before
	public void befor() {

		String source = "applicationContext.xml";// 配置文件的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		familyadminDao = (FamilyadminDAO) ac.getBean("FamilyadminDAO");// 参数是dao在配置文件bean的id

	}

	 @Test
	 public void save() {
	
	 familyadmin = new Familyadmin("cruiser", "root", "online", "shanghai");
	 familyadminDao.save(familyadmin);
	 System.out.println("familyadminDao.save  successful");
	 }

	@Test
	public void delete() {

		familyadmin = new Familyadmin("cruiser", "root", "online", "shanghai");
		familyadmin.setFamilyAdminId(3);
		try {
			familyadminDao.delete(familyadmin);
			System.out.println("familyadminDao.delete  successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	@Test
	public void merge() {

		familyadmin = new Familyadmin("cruiser", "123", "online",
				"shanghai12346");
		familyadmin.setFamilyAdminId(1);
		familyadminDao.merge(familyadmin);
		System.out.println("familyadminDao.merge  successful");
	}

	@Test
	public void findByName() {

		familyadminDao.findByName("cruiser");
		System.out.println("familyadminDao.findByName  successful");
	}

	@Test
	public void test() {
		// fail("Not yet implemented");

		System.out.println("test");

	}

}

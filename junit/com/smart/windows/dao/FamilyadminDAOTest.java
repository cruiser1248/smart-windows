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
	public void befor(){
		
		String source = "applicationContext.xml";// 配置文件的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext(source);
		familyadminDao = (FamilyadminDAO) ac.getBean("FamilyadminDAO");// 参数是dao在配置文件bean的id
		
		
	}
	
	@Test
	public void save(){
		
		familyadmin = new Familyadmin("aa", "aa", "zai", 123, "shang hai");
		familyadminDao.save(familyadmin);
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		System.out.println("test");
		
	}

}

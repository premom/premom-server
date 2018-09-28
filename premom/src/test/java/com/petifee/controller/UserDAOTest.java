package com.petifee.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.petifee.domain.UserVO;
import com.petifee.persistence.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDAOTest {
	@Inject
	private UserDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertUser() throws Exception {
//		UserVO temp = new UserVO();
//		temp.setUid("gondr1");
//		temp.setUpw("1234");
//		temp.setUname("최선한");
//		temp.setUpoint(0);		
//		dao.insertUser(temp);
	}
	
	@Test
	public void testReadUser() throws Exception {
		UserVO temp = dao.readUser("gondr");
		System.out.println(temp.toString());
	}
	
	@Test
	public void testReadWithPW() throws Exception {
		UserVO temp = dao.readWithPw("gondr", "1234");
		System.out.println(temp.toString());
	}


}

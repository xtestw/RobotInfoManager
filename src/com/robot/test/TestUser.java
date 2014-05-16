package com.robot.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.robot.model.UserInfo;
import com.robot.service.inte.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestUser {
	private IUserInfoService userInfoServiceDao;
	 
	

	public IUserInfoService getUserInfoServiceDao() {
		return userInfoServiceDao;
	}


	@Resource
	public void setUserInfoServiceDao(IUserInfoService userInfoServiceDao) {
		this.userInfoServiceDao = userInfoServiceDao;
	}



	@Test
	public void test01()
	{
		userInfoServiceDao.listAllUser();
	}
}

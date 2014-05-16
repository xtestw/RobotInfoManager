package com.robot.test;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.robot.service.inte.ISettingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class SettingTest {

	private ISettingService settingService;
	
	public ISettingService getSettingService() {
		return settingService;
	}

	@Resource
	public void setSettingService(ISettingService settingService) {
		this.settingService = settingService;
	}

	@Test
	public void test() {
		settingService.setFactory("0project");
		System.out.println(settingService.getParam("CP").getValue());
	}

}

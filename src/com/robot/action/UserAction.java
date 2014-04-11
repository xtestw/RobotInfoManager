package com.robot.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.UserInfo;
import com.robot.service.inte.IUserInfoService;
import com.robot.util.ActionUtil;



@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<UserInfo>{
	private IUserInfoService userInfoService;
	private UserInfo userInfo;
	
	

	public IUserInfoService getUserInfoService() {
		return userInfoService;
	}
	@Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public UserInfo getModel() {
		if (userInfo==null) userInfo=new UserInfo();
		return userInfo;
	}
	
	public String info(){

		return SUCCESS;
	}
	
	public String update()
	{
		userInfoService.update(userInfo);
		ActionContext.getContext().getSession().put("loginUser", userInfo);
		ActionUtil.setUrl("user_info.action");
		return "redirect";
	}
	
}

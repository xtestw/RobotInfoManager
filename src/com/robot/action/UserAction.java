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
public class UserAction extends ActionSupport {
	private IUserInfoService userInfoService;
	private UserInfo userInfo;
	private String username,prepassword,curpassword,recurpassword;
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPrepassword() {
		return prepassword;
	}
	public void setPrepassword(String prepassword) {
		this.prepassword = prepassword;
	}
	public String getCurpassword() {
		return curpassword;
	}
	public void setCurpassword(String curpassword) {
		this.curpassword = curpassword;
	}
	public String getRecurpassword() {
		return recurpassword;
	}
	public void setRecurpassword(String recurpassword) {
		this.recurpassword = recurpassword;
	}
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
	
	public String info(){

		return SUCCESS;
	}
	
	public String update()
	{
		System.out.println(username+prepassword);
		userInfo=userInfoService.Login(username, prepassword);
		userInfo.setUserPwd(curpassword);
		System.out.println(userInfo.getUserName()+ "+ " +userInfo.getUserPwd());
		userInfoService.update(userInfo);
		System.out.println("update sucess!");
		ActionContext.getContext().getSession().remove("loginUser");
		ActionContext.getContext().getSession().put("loginUser", userInfo);
		ActionUtil.setUrl("user_info.action");
		return "redirect";
	}
	
}

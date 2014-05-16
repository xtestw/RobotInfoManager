package com.robot.action;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.robot.model.Pager;
import com.robot.model.Project;
import com.robot.model.UserInfo;
import com.robot.service.ProjectService;
import com.robot.service.inte.IProjectService;
import com.robot.service.inte.IUserInfoService;

/**
 * @author xuwei
 *
 */
@Controller("loginAction")
@Scope("prototype")
public class LoginAction {
	private String username;
	private String password;
	private UserInfo userInfo;
	private IProjectService projectService;


	public IProjectService getProjectService() {
		return projectService;
	}
	
	@Resource
	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public IUserInfoService getUserInfoService() {
		return userInfoService;
	}
    @Resource(name="userInfoService")
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	private IUserInfoService userInfoService; 
	
	public String login()
	{
		UserInfo u = userInfoService.Login(username, password);
		ActionContext.getContext().getSession().put("loginUser", u);
		
		return "success";
	}
	
	public String register()
	{
		userInfo.setCreateTime(new Date());
		userInfoService.add(userInfo);
		Pager<Project> projects=projectService.findProject();

		ActionContext.getContext().getSession().put("loginUser", userInfo);

		ActionContext.getContext().getSession().put("projects", projects);
		return "success";
	}
}

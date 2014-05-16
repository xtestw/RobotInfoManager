package com.robot.service.inte;

import java.util.List;

import com.robot.model.Pager;
import com.robot.model.UserInfo;

public interface IUserInfoService {
	
	public void add(UserInfo userInfo);
	
	public void delete(int id);
	
	public void update(UserInfo userInfo);
	
	public UserInfo load(int id);
	
	public List<UserInfo> listAllUser();
	
	public Pager<UserInfo> findAllUser();
	
	public UserInfo load(String username);
	
	public UserInfo Login(String username,String password);
}

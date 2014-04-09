package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.robot.dao.inte.IUserInfoDao;
import com.robot.exception.DocumentException;
import com.robot.model.Pager;
import com.robot.model.UserInfo;
import com.robot.service.inte.IUserInfoService;

@Service("userInfoService")
public class UserInfoService implements IUserInfoService {
	
	private IUserInfoDao userInfoDao;
	

	public IUserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	@Resource
	public void setUserInfoDao(IUserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public void add(UserInfo userInfo) {
		try{
			userInfoDao.add(userInfo);
		}catch(Exception e){
			throw new DocumentException("注册失败请重新注册");
		}
	}

	@Override
	public void delete(int id) {
		userInfoDao.delete(id);
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}

	@Override
	public UserInfo load(int id) {
		return userInfoDao.load(id);
	}

	@Override
	public List<UserInfo> listAllUser() {
		return userInfoDao.list("from UserInfo");
	}

	@Override
	public UserInfo load(String username) {
		// TODO Auto-generated method stub
		String hql="select user from UserInfo user where user.userName=?";
		
		return (UserInfo) userInfoDao.queryByHql(hql,username);
	}
	@Override
	public Pager<UserInfo> findAllUser() {
		Pager<UserInfo> users = null;
		users=userInfoDao.find("from UserInfo");
		return users;
	}
	@Override
	public UserInfo Login(String username, String password) {
		UserInfo user = load(username);
		if (user == null || !user.getUserPwd().equals(password)){
			throw new DocumentException("用户不存在或用户名密码错误");
		}
		return user;
	}
	
}

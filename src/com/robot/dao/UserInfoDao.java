package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IUserInfoDao;
import com.robot.model.UserInfo;


@Repository("userInfoDao")
public class UserInfoDao extends SBaseDao<UserInfo> implements IUserInfoDao  {

}

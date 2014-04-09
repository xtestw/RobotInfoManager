package com.robot.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

public class SBaseDao<T> extends BaseDao<T> {
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSuperSessionFactory(sessionFactory);
	}
	
}

package com.robot.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBaseDao<T> extends BaseDao<T> {
	
	public void setSuperSessionFactory(String name) {
		Configuration configuration=new Configuration()
								.setProperty("hibernate.connection.url",	
												"jdbc:mysql://localhost:3306/"+name)
							    .configure("project.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();	
		super.setSuperSessionFactory(sessionFactory);
	}
	
	@Resource(name="sessionFactory2")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSuperSessionFactory(sessionFactory);
	}

	public DBaseDao(String name) {
		this.setSuperSessionFactory(name);
	}
	
	public DBaseDao()
	{
	
	}
}

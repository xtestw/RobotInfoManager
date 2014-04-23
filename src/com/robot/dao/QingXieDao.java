package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IQingXieDao;
import com.robot.model.QingXie;


@Repository("qingXieDao")
@Scope("prototype")
public class QingXieDao extends DBaseDao<QingXie> implements IQingXieDao {
	public QingXieDao(){
		super();
	}
}

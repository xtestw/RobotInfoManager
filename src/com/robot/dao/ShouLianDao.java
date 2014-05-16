package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IShouLianDao;
import com.robot.model.ShouLian;


@Repository("shouLianDao")
@Scope("prototype")
public class ShouLianDao extends DBaseDao<ShouLian> implements IShouLianDao {
	public ShouLianDao(){
		super();
	}
}

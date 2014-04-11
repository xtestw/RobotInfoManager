package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.ISectionInfoDao;
import com.robot.model.SectionInfo;

@Repository("sectionInfoDao")
@Scope("prototype")
public class SectionInfoDao extends DBaseDao<SectionInfo> implements ISectionInfoDao {


	public SectionInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

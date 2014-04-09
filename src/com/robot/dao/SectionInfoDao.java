package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.ISectionInfoDao;
import com.robot.model.SectionInfo;

@Repository("sectionInfoDao")
public class SectionInfoDao extends DBaseDao<SectionInfo> implements ISectionInfoDao {

	public SectionInfoDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SectionInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.SectionInfoDao;
import com.robot.dao.ShouLianDao;
import com.robot.model.SectionInfo;
import com.robot.model.ShouLian;
import com.robot.service.inte.ISectionInfoService;
import com.robot.service.inte.IShouLianService;


@Service("shouLianService")
@Scope("prototype")
public class ShouLianService implements IShouLianService {

	private ShouLianDao shouLianDao;
	
	
	public ShouLianDao getShouLianDao() {
		return shouLianDao;
	}
	@Resource
	public void setShouLianDao(ShouLianDao shouLianDao) {
		this.shouLianDao = shouLianDao;
	}
	@Override
	public void setFactory(String name) {
		shouLianDao.setSuperSessionFactory(name);
	}
	@Override
	public List<ShouLian> list(String pgName) {
		return shouLianDao.list("from ShouLian s where s.PGName="+pgName);
	}
	



}

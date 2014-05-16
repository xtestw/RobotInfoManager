package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.SectionInfoDao;
import com.robot.model.SectionInfo;
import com.robot.service.inte.ISectionInfoService;


@Service("sectionInfoService")
@Scope("prototype")
public class SectionInfoService implements ISectionInfoService {

	private SectionInfoDao sectionInfoDao;
	
	public SectionInfoDao getSectionInfoDao() {
		return sectionInfoDao;
	}
	@Resource
	public void setSectionInfoDao(SectionInfoDao sectionInfoDao) {
		this.sectionInfoDao = sectionInfoDao;
	}

	@Override
	public void add(SectionInfo sectionInfo) {
		sectionInfoDao.add(sectionInfo);
	}

	@Override
	public void delete(SectionInfo sectionInfo) {
		sectionInfoDao.delete(sectionInfo);
	}

	@Override
	public void delete(int id) {
		sectionInfoDao.delete(id);
	}

	@Override
	public SectionInfo load(int id) {
		return sectionInfoDao.load(id);
	}

	@Override
	public void update(SectionInfo sectionInfo) {
		sectionInfoDao.update(sectionInfo);
	}
	@Override
	public void setFactory(String name) {
		sectionInfoDao.setSuperSessionFactory(name);
	}
	@Override
	public List<SectionInfo> list() {
		// TODO Auto-generated method stub
		return sectionInfoDao.list("from SectionInfo");
	}



}

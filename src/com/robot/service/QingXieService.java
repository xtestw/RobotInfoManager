package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.QingXieDao;
import com.robot.dao.SectionInfoDao;
import com.robot.dao.ShouLianDao;
import com.robot.model.QingXie;
import com.robot.model.SectionInfo;
import com.robot.model.ShouLian;
import com.robot.service.inte.IQingXieService;
import com.robot.service.inte.ISectionInfoService;
import com.robot.service.inte.IShouLianService;


@Service("qingXieService")
@Scope("prototype")
public class QingXieService implements IQingXieService {

	private QingXieDao qingXieDao;
	
	public QingXieDao getQingXieDao() {
		return qingXieDao;
	}
	@Resource
	public void setQingXieDao(QingXieDao qingXieDao) {
		this.qingXieDao = qingXieDao;
	}
	@Override
	public void setFactory(String name) {
		qingXieDao.setSuperSessionFactory(name);
	}
	@Override
	public List<QingXie> list(String pgName) {
		return qingXieDao.list("from QingXie s where s.PGName="+pgName);
	}
	



}

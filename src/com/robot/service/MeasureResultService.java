package com.robot.service;

import javax.annotation.Resource;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.MeasureResultDao;
import com.robot.model.MeasureResult;
import com.robot.service.inte.IMeasureResultService;

@Service("mesureResultService")
@Scope("prototype")
public class MeasureResultService implements IMeasureResultService {

	private MeasureResultDao measureResultDao;
		
	public MeasureResultDao getMeasureResultDao() {
		return measureResultDao;
	}
	@Resource
	public void setMeasureResultDao(MeasureResultDao measureResultDao) {
		this.measureResultDao = measureResultDao;
	}

	@Override
	public void add(MeasureResult measureResult) {
		measureResultDao.add(measureResult);
	}

	@Override
	public void delete(MeasureResult measureResult) {
		measureResultDao.delete(measureResult);
	}

	@Override
	public void delete(int id) {
		measureResultDao.delete(id);
	}

	@Override
	public MeasureResult load(int id) {
		return measureResultDao.load(id);
	}

	@Override
	public void update(MeasureResult measureResult) {
		measureResultDao.update(measureResult);
	}
	@Override
	public void setFactory(String name) {
		measureResultDao.setSuperSessionFactory(name);
	}


}

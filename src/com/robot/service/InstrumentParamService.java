package com.robot.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.InstrumentParamDao;
import com.robot.model.InstrumentParam;
import com.robot.service.inte.IInstrumentParamService;
@Service("instrumentParamService")
@Scope("prototype")
public class InstrumentParamService implements IInstrumentParamService {

	private InstrumentParamDao instrumentParamDao;
	
	public InstrumentParamDao getInstrumentParamDao() {
		return instrumentParamDao;
	}
	
	@Resource
	public void setInstrumentParamDao(InstrumentParamDao instrumentParamDao) {
		this.instrumentParamDao = instrumentParamDao;
	}

	@Override
	public List<InstrumentParam> list() {
		// TODO Auto-generated method stub
		return instrumentParamDao.list("from InstrumentParam");
	}

	@Override
	public void setFactory(String name) {
		// TODO Auto-generated method stub
		instrumentParamDao.setSuperSessionFactory(name);
	}

	

}

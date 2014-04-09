package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IInstrumentParamDao;
import com.robot.model.InstrumentParam;




@Repository("instrumentParamDao")
public class InstrumentParamDao extends DBaseDao<InstrumentParam> implements
		IInstrumentParamDao {

	public InstrumentParamDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public InstrumentParamDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}

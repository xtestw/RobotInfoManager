package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IInstrumentParamDao;
import com.robot.model.InstrumentParam;




@Repository("instrumentParamDao")
@Scope("prototype")
public class InstrumentParamDao extends DBaseDao<InstrumentParam> implements
		IInstrumentParamDao {

	

	public InstrumentParamDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}

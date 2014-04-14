package com.robot.service.inte;


import java.util.List;

import com.robot.model.InstrumentParam;
import com.robot.model.Setting;



public interface IInstrumentParamService {
	public List<InstrumentParam> list();
	public void setFactory(String name);

}

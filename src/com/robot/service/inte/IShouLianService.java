package com.robot.service.inte;

import java.util.List;

import com.robot.model.SectionInfo;
import com.robot.model.ShouLian;



public interface IShouLianService {
	
	public void setFactory(String name);

	public List<ShouLian> list(String pgName);
	
}

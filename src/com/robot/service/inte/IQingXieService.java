package com.robot.service.inte;

import java.util.List;

import com.robot.model.QingXie;



public interface IQingXieService {
	
	public void setFactory(String name);

	public List<QingXie> list(String pgName);
	
}

package com.robot.service.inte;

import com.robot.model.SectionInfo;



public interface ISectionInfoService {
	public void add(SectionInfo sectionInfo);
	public void delete(SectionInfo sectionInfo);
	public void delete(int id);
	
	public SectionInfo load(int id);
	
	public void update(SectionInfo sectionInfo);
	
	public void setFactory(String name);
	
}

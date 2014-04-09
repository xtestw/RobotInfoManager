package com.robot.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.robot.model.Project;
import com.robot.service.inte.IProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class ProjectTest {
	private IProjectService projectService;
	
	public IProjectService getProjectService() {
		return projectService;
	}
	@Resource
	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}

	@Test
	public void add()
	{
		for (int i=0;i<57;i++){
			Project tProject=new Project();
			tProject.setProjectName(i+"project");
			tProject.setProjectNote("note"+i);
			projectService.add(tProject);
		}
	}
}

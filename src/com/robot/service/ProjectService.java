package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.robot.dao.ProjectDao;
import com.robot.model.Pager;
import com.robot.model.Project;
import com.robot.model.UserInfo;
import com.robot.service.inte.IProjectService;


@Service("projectService")
public class ProjectService implements IProjectService {
	
	private ProjectDao projectDao;
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}

	@Resource
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	@Override
	public void add(Project project) {
		projectDao.add(project);
	}

	@Override
	public void delete(Project project) {
		projectDao.delete(project);		
	}

	@Override
	public Project load(int id) {
		return projectDao.load(id);		
	}

	@Override
	public Pager<Project> findProject(UserInfo user) {
		return null;
	}

	@Override
	public Pager<Project> findProject() {
		return projectDao.find("select project from Project project");
	}

	public void update(Project project) {
		projectDao.update(project);
	}

	@Override
	public List<Project> list() {
		return projectDao.list("from Project");
	}

	

}

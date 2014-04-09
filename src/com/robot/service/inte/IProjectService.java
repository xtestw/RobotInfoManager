package com.robot.service.inte;

import java.util.List;

import org.ietf.jgss.Oid;

import com.robot.model.Pager;
import com.robot.model.Project;
import com.robot.model.UserInfo;


public interface IProjectService {
	public void add(Project project);
	public void delete(Project project);
	public Project load(int id);
	public Pager<Project> findProject(UserInfo user);
	public Pager<Project> findProject();
	public void update(Project project);
	public List<Project> list();
}

package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IProjectDao;
import com.robot.model.Project;


@Repository("projectDao")
public class ProjectDao extends SBaseDao<Project> implements IProjectDao {

}

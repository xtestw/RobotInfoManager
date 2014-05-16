package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.Project;
import com.robot.service.ProjectService;
import com.robot.service.inte.IProjectService;
import com.robot.util.ActionUtil;


@Controller("projectAction")
@Scope("prototype")
public class ProjectAction extends ActionSupport implements ModelDriven<Project>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6917310496202465120L;

	private IProjectService projectService;
	
	private Project project;
	
	private List<Project> projects;
	
	@JSON(serialize=false)
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	

	@JSON(serialize=false)
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@JSON(serialize=false)
	public IProjectService getProjectService() {
		return projectService;
	}
	@Resource
	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}

	@Override

	@JSON(serialize=false)
	public Project getModel() {
		// TODO Auto-generated method stub
		if (project == null) project = new Project();
		return project;
	} 
	
	
	public String add()
	{
		projectService.add(project);
		return SUCCESS;
	}
	
	public String open()
	{
		ActionContext.getContext().getSession().put("selectProject", project);
		return SUCCESS;
	}
	
	public String update(){
		projectService.update(project);
		
		return "ajaxsuccess";
		//ActionUtil.setUrl("/WEB-INF/jsp/project/list.jsp");
		//return "redirect";
	}
	public String list(){
		
		projects=projectService.list();
		System.out.println(projects.size());
	//	ActionContext.getContext().getSession().put("projects", projects);
		return SUCCESS;
	}
	public String del()
	{
		projectService.update(project);
		ActionUtil.setUrl("/WEB-INF/jsp/project/list.jsp");
		return "redirect";   
	}
	
	public String select()
	{
		project=projectService.load(project.getProjectName());
		ServletActionContext.getContext().getSession().put("curProject", project);
		ActionUtil.setUrl("project_list.action");
		return "redirect";
	}
}

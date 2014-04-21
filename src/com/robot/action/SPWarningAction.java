package com.robot.action;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.ShouLian;
import com.robot.model.WarningSetting;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.IPointInfoService;
import com.robot.service.inte.ISettingService;
import com.robot.service.inte.IShouLianService;
import com.robot.util.ActionUtil;

@Controller("spWarningAction")
@Scope("prototype")
public class SPWarningAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3211301933344955324L;
	private String projectname;
	private ShouLian shouLian;
	private IShouLianService shouLianService;
	private List<ShouLian> shouLians;
	private List<PointGroupInfo> pointGroupInfos;
	private IPointGroupInfoService pointGroupInfoService;
	private String PGName;

	@JSON(serialize=false)
	public String getPGName() {
		return PGName;
	}

	public void setPGName(String pGName) {
		PGName = pGName;
	}

	@JSON(serialize=false)
	public IPointGroupInfoService getPointGroupInfoService() {
		return pointGroupInfoService;
	}

	@Resource
	public void setPointGroupInfoService(
			IPointGroupInfoService pointGroupInfoService) {
		this.pointGroupInfoService = pointGroupInfoService;
	}

	@JSON(serialize=false)
	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	@JSON(serialize=false)
	public IShouLianService getShouLianService() {
		return shouLianService;
	}

	@Resource
	public void setShouLianService(IShouLianService shouLianService) {
		this.shouLianService = shouLianService;
	}

	@JSON(serialize=false)
	public ShouLian getShouLian() {
		return shouLian;
	}

	public void setShouLian(ShouLian shouLian) {
		this.shouLian = shouLian;
	}
	
	public List<ShouLian> getShouLians() {
		return shouLians;
	}

	public void setShouLians(List<ShouLian> shouLians) {
		this.shouLians = shouLians;
	}

	@JSON(serialize=false)
	public List<PointGroupInfo> getPointGroupInfos() {
		return pointGroupInfos;
	}

	public void setPointGroupInfos(List<PointGroupInfo> pointGroupInfos) {
		this.pointGroupInfos = pointGroupInfos;
	}


	public String list()
	{
		pointGroupInfoService.setFactory(projectname);
		pointGroupInfos=pointGroupInfoService.list();
		return SUCCESS;
	}

	public String query()
	{
		shouLianService.setFactory(projectname);
		List<ShouLian> lians=shouLianService.list(getPGName());
		shouLians=new ArrayList<ShouLian>();
		for(ShouLian i:lians){
			System.out.println(i.getLeftPointName()+" "+i.getRightPointName());
			shouLians.add(i);
		}
		return ActionUtil.AJAXSUCCESS;
	}


}

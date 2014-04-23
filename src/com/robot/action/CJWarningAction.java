package com.robot.action;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointCoord;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.Setting;
import com.robot.model.ShouLian;
import com.robot.model.WarningSetting;
import com.robot.service.inte.IPointCoordService;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.IPointInfoService;
import com.robot.service.inte.ISettingService;
import com.robot.service.inte.IShouLianService;
import com.robot.util.ActionUtil;

@Controller("cjWarningAction")
@Scope("prototype")
public class CJWarningAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3211301933344955324L;
	private String projectname;
	private PointCoord pointCoord;
	private IPointCoordService pointCoordService;
	private List<PointCoord> pointCoords;
	private List<PointGroupInfo> pointGroupInfos;
	private IPointGroupInfoService pointGroupInfoService;
	private String PGName;
	private ISettingService settingService;
	
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
	public PointCoord getPointCoord() {
		return pointCoord;
	}

	public void setPointCoord(PointCoord pointCoord) {
		this.pointCoord = pointCoord;
	}

	@JSON(serialize=false)
	public IPointCoordService getPointCoordService() {
		return pointCoordService;
	}

	@Resource
	public void setPointCoordService(IPointCoordService pointCoordService) {
		this.pointCoordService = pointCoordService;
	}

	public List<PointCoord> getPointCoords() {
		return pointCoords;
	}

	public void setPointCoords(List<PointCoord> pointCoords) {
		this.pointCoords = pointCoords;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JSON(serialize=false)
	public List<PointGroupInfo> getPointGroupInfos() {
		return pointGroupInfos;
	}

	public void setPointGroupInfos(List<PointGroupInfo> pointGroupInfos) {
		this.pointGroupInfos = pointGroupInfos;
	}

	@JSON(serialize=false)
	public ISettingService getSettingService() {
		return settingService;
	}

	@Resource
	public void setSettingService(ISettingService settingService) {
		this.settingService = settingService;
	}

	public String list()
	{
		pointGroupInfoService.setFactory(projectname);
		pointGroupInfos=pointGroupInfoService.list();
		return SUCCESS;
	}

	public String query()
	{
		settingService.setFactory(projectname);
		pointCoordService.setFactory(projectname);
	    Setting cp=settingService.getParam("CP");
		pointCoords=pointCoordService.listCJ(getPGName());
	
		return ActionUtil.AJAXSUCCESS;
	}


}

package com.robot.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.QingXie;
import com.robot.model.Setting;
import com.robot.model.ShouLian;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.IQingXieService;
import com.robot.service.inte.ISettingService;
import com.robot.service.inte.IShouLianService;
import com.robot.util.ActionUtil;

@Controller("qxWarningAction")
@Scope("prototype")
public class QXWarningAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3211301933344955324L;
	private String projectname;
	private QingXie qingXie;
	private IQingXieService qingXieService;
	private List<QingXie> qingXies;
	private List<PointGroupInfo> pointGroupInfos;
	private IPointGroupInfoService pointGroupInfoService;
	private String PGName;
    private List<PointInfo> lpointInfos;
    private List<PointInfo> rpointInfos;
    private ISettingService settingService;
    
	public List<PointInfo> getLpointInfos() {
		return lpointInfos;
	}

	public void setLpointInfos(List<PointInfo> lpointInfos) {
		this.lpointInfos = lpointInfos;
	}

	public List<PointInfo> getRpointInfos() {
		return rpointInfos;
	}

	public void setRpointInfos(List<PointInfo> rpointInfos) {
		this.rpointInfos = rpointInfos;
	}
   
	@JSON(serialize=false)
	public ISettingService getSettingService() {
		return settingService;
	}

	@Resource
	public void setSettingService(ISettingService settingService) {
		this.settingService = settingService;
	}

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
	public QingXie getQingXie() {
		return qingXie;
	}

	public void setQingXie(QingXie qingXie) {
		this.qingXie = qingXie;
	}

	@JSON(serialize=false)
	public IQingXieService getQingXieService() {
		return qingXieService;
	}

	@Resource
	public void setQingXieService(IQingXieService qingXieService) {
		this.qingXieService = qingXieService;
	}

	public List<QingXie> getQingXies() {
		return qingXies;
	}

	public void setQingXies(List<QingXie> qingXies) {
		this.qingXies = qingXies;
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


	public String list()
	{
		pointGroupInfoService.setFactory(projectname);
		pointGroupInfos=pointGroupInfoService.list();
		return SUCCESS;
	}

	public String query()
	{
		qingXieService.setFactory(projectname);
		qingXies=qingXieService.list(getPGName());
		settingService.setFactory(projectname);
		Setting qx=settingService.getParam("QX");
		Setting qxv=settingService.getParam("QXV");
		lpointInfos=qingXieService.getTopWarning(qingXies,qx,qxv);
		rpointInfos=qingXieService.getBottomWarning(qingXies,qx,qxv);
		return ActionUtil.AJAXSUCCESS;
	}


}

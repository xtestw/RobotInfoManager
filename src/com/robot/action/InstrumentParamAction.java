package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.InstrumentParam;
import com.robot.model.Setting;
import com.robot.model.StationInfo;
import com.robot.service.inte.IInstrumentParamService;
import com.robot.service.inte.ISettingService;
import com.robot.service.inte.IStationInfoService;

@Controller("instrumentParamAction")
@Scope("prototype")
public class InstrumentParamAction extends ActionSupport implements ModelDriven<InstrumentParam> {
	private IInstrumentParamService instrumentParamService;
	private String projectname;
	private InstrumentParam instrumentParam;
	private List<InstrumentParam> instrumentParams;

	public IInstrumentParamService getInstrumentParamService() {
		return instrumentParamService;
	}
	@Resource
	public void setInstrumentParamService(
			IInstrumentParamService instrumentParamService) {
		this.instrumentParamService = instrumentParamService;
	}

	public InstrumentParam getInstrumentParam() {
		return instrumentParam;
	}
	public void setInstrumentParam(InstrumentParam instrumentParam) {
		this.instrumentParam = instrumentParam;
	}
	public List<InstrumentParam> getInstrumentParams() {
		return instrumentParams;
	}
	public void setInstrumentParams(List<InstrumentParam> instrumentParams) {
		this.instrumentParams = instrumentParams;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	

	public String list()
	{
		instrumentParamService.setFactory(projectname);
		instrumentParams=instrumentParamService.list();
		return SUCCESS;
	}
	@Override
	public InstrumentParam getModel() {
		// TODO Auto-generated method stub
		if (instrumentParam==null) instrumentParam=new InstrumentParam();
		return instrumentParam;
	}
}

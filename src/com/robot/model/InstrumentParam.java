package com.robot.model;

public class InstrumentParam {
	private String srial;
	private String name;
	private String port;
	private String dataFormat;
	private Integer baud;
	private Integer timeOutSet;
	
	public String getSrial() {
		return srial;
	}
	public void setSrial(String srial) {
		this.srial = srial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDataFormat() {
		return dataFormat;
	}
	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}
	public Integer getBaud() {
		return baud;
	}
	public void setBaud(Integer baud) {
		this.baud = baud;
	}
	public Integer getTimeOutSet() {
		return timeOutSet;
	}
	public void setTimeOutSet(Integer timeOutSet) {
		this.timeOutSet = timeOutSet;
	}
	
	
}

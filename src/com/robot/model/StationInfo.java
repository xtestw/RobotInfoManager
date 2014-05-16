package com.robot.model;

import java.util.Date;


public class StationInfo {
	private String stationName;
	private String standardPtName;
	private String orientPtName;
	private Float instHeight;
	private Float tagtHeight;
	private Float temp;
	private Float pressure;
	private Float humidity;
	private String seril;
	private String morphReport;
	private Date createDate;
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStandardPtName() {
		return standardPtName;
	}
	public void setStandardPtName(String standardPtName) {
		this.standardPtName = standardPtName;
	}
	public String getOrientPtName() {
		return orientPtName;
	}
	public void setOrientPtName(String orientPtName) {
		this.orientPtName = orientPtName;
	}
	public Float getInstHeight() {
		return instHeight;
	}
	public void setInstHeight(Float instHeight) {
		this.instHeight = instHeight;
	}
	public Float getTagtHeight() {
		return tagtHeight;
	}
	public void setTagtHeight(Float tagtHeight) {
		this.tagtHeight = tagtHeight;
	}
	public Float getTemp() {
		return temp;
	}
	public void setTemp(Float temp) {
		this.temp = temp;
	}
	public Float getPressure() {
		return pressure;
	}
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}
	public Float getHumidity() {
		return humidity;
	}
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	public String getSeril() {
		return seril;
	}
	public void setSeril(String seril) {
		this.seril = seril;
	}
	public String getMorphReport() {
		return morphReport;
	}
	public void setMorphReport(String morphReport) {
		this.morphReport = morphReport;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}

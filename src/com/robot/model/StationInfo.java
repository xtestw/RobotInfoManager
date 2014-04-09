package com.robot.model;

import java.util.Date;


public class StationInfo {
	private String stationName;
	private String standardPtName;
	private String orientPtName;
	private float instHeight;
	private float tagtHeight;
	private float temp;
	private float pressure;
	private float humidity;
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
	public float getInstHeight() {
		return instHeight;
	}
	public void setInstHeight(float instHeight) {
		this.instHeight = instHeight;
	}
	public float getTagtHeight() {
		return tagtHeight;
	}
	public void setTagtHeight(float tagtHeight) {
		this.tagtHeight = tagtHeight;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
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

package com.robot.model;

import java.util.Date;

public class MeasureResult {
	private Integer mrId;
	private String stationNameString;
	private String pGName;
	private String pointName;
	private Float nop;
	private Float hz;
	private Float v;
	private Float dist;
	private String faceMode;
	private Date mesureTime;
	public Integer getMrId() {
		return mrId;
	}
	public void setMrId(Integer mrId) {
		this.mrId = mrId;
	}
	public String getStationNameString() {
		return stationNameString;
	}
	public void setStationNameString(String stationNameString) {
		this.stationNameString = stationNameString;
	}
	public String getpGName() {
		return pGName;
	}
	public void setpGName(String pGName) {
		this.pGName = pGName;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public Float getNop() {
		return nop;
	}
	public void setNop(Float nop) {
		this.nop = nop;
	}
	public Float getHz() {
		return hz;
	}
	public void setHz(Float hz) {
		this.hz = hz;
	}
	public Float getV() {
		return v;
	}
	public void setV(Float v) {
		this.v = v;
	}
	public Float getDist() {
		return dist;
	}
	public void setDist(Float dist) {
		this.dist = dist;
	}
	public String getFaceMode() {
		return faceMode;
	}
	public void setFaceMode(String faceMode) {
		this.faceMode = faceMode;
	}
	public Date getMesureTime() {
		return mesureTime;
	}
	public void setMesureTime(Date mesureTime) {
		this.mesureTime = mesureTime;
	}
	

}

package com.robot.model;

import java.util.Date;

public class MeasureResult {
	private int mrId;
	private String stationNameString;
	private String pGName;
	private String pointName;
	private float nop;
	private float hz;
	private float v;
	private float dist;
	private String faceMode;
	private Date mesureTime;
	

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
	public float getNop() {
		return nop;
	}
	public void setNop(float nop) {
		this.nop = nop;
	}
	public float getHz() {
		return hz;
	}
	public void setHz(float hz) {
		this.hz = hz;
	}
	public float getV() {
		return v;
	}
	public void setV(float v) {
		this.v = v;
	}
	public int getMrId() {
		return mrId;
	}
	public void setMrId(int mrId) {
		this.mrId = mrId;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public float getDist() {
		return dist;
	}
	public void setDist(float dist) {
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

package com.robot.model;

import java.util.Date;

public class PointGroupInfo {
	
	private String pointGroupNameString;
	private String contianPoint;
	private String measurePeriod;
	private String measureMode;
	private int roundCount;
	private int tryCount;
	private String remark;
	private Date createTime;
	

	public String getPointGroupNameString() {
		return pointGroupNameString;
	}
	public void setPointGroupNameString(String pointGroupNameString) {
		this.pointGroupNameString = pointGroupNameString;
	}
	public String getMeasurePeriod() {
		return measurePeriod;
	}
	public void setMeasurePeriod(String measurePeriod) {
		this.measurePeriod = measurePeriod;
	}
	public String getMeasureMode() {
		return measureMode;
	}
	public void setMeasureMode(String measureMode) {
		this.measureMode = measureMode;
	}
	public int getRoundCount() {
		return roundCount;
	}
	public String getContianPoint() {
		return contianPoint;
	}
	public void setContianPoint(String contianPoint) {
		this.contianPoint = contianPoint;
	}
	public void setRoundCount(int roundCount) {
		this.roundCount = roundCount;
	}
	public int getTryCount() {
		return tryCount;
	}
	public void setTryCount(int tryCount) {
		this.tryCount = tryCount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}

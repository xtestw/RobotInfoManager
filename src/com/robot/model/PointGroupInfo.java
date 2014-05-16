package com.robot.model;

import java.util.Date;

public class PointGroupInfo {
	
	private String pointGroupName;
	private String contianPoint;
	private String measurePeriod;
	private String measureMode;
	private Integer roundCount;
	private Integer tryCount;
	private String remark;
	private Date createTime;
	public String getPointGroupName() {
		return pointGroupName;
	}
	public void setPointGroupName(String pointGroupName) {
		this.pointGroupName = pointGroupName;
	}
	public String getContianPoint() {
		return contianPoint;
	}
	public void setContianPoint(String contianPoint) {
		this.contianPoint = contianPoint;
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
	public Integer getRoundCount() {
		return roundCount;
	}
	public void setRoundCount(Integer roundCount) {
		this.roundCount = roundCount;
	}
	public Integer getTryCount() {
		return tryCount;
	}
	public void setTryCount(Integer tryCount) {
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

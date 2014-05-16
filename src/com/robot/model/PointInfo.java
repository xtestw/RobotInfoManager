package com.robot.model;

import java.util.Date;

public class PointInfo {
	
	private  String pointName;
	private String PointType;
	private String isSteady;
	private Float x,y,z;
	private String remark;
	private Date createTimeDate;
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getPointType() {
		return PointType;
	}
	public void setPointType(String pointType) {
		PointType = pointType;
	}
	public String getIsSteady() {
		return isSteady;
	}
	public void setIsSteady(String isSteady) {
		this.isSteady = isSteady;
	}
	public Float getX() {
		return x;
	}
	public void setX(Float x) {
		this.x = x;
	}
	public Float getY() {
		return y;
	}
	public void setY(Float y) {
		this.y = y;
	}
	public Float getZ() {
		return z;
	}
	public void setZ(Float z) {
		this.z = z;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTimeDate() {
		return createTimeDate;
	}
	public void setCreateTimeDate(Date createTimeDate) {
		this.createTimeDate = createTimeDate;
	}

	
	
}

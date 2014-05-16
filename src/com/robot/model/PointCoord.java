package com.robot.model;

import java.util.Date;


public class PointCoord {
	private Integer pcid;
	private String pointName;
	private String PGName;
	private Integer nop;
	private Float twoc,ieovc,X,Y,Z;
	private Float theXDiff;
	private Float theYDiff;
	private Float theZDiff;
	private Float totalXdiff,totalYDiff,totalZDiff;
	private Date measureTime;
	public Integer getPcid() {
		return pcid;
	}
	public void setPcid(Integer pcid) {
		this.pcid = pcid;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getPGName() {
		return PGName;
	}
	public void setPGName(String pGName) {
		PGName = pGName;
	}
	public Integer getNop() {
		return nop;
	}
	public void setNop(Integer nop) {
		this.nop = nop;
	}
	public Float getTwoc() {
		return twoc;
	}
	public void setTwoc(Float twoc) {
		this.twoc = twoc;
	}
	public Float getIeovc() {
		return ieovc;
	}
	public void setIeovc(Float ieovc) {
		this.ieovc = ieovc;
	}
	public Float getX() {
		return X;
	}
	public void setX(Float x) {
		X = x;
	}
	public Float getY() {
		return Y;
	}
	public void setY(Float y) {
		Y = y;
	}
	public Float getZ() {
		return Z;
	}
	public void setZ(Float z) {
		Z = z;
	}
	public Float getTheXDiff() {
		return theXDiff;
	}
	public void setTheXDiff(Float theXDiff) {
		this.theXDiff = theXDiff;
	}
	public Float getTheYDiff() {
		return theYDiff;
	}
	public void setTheYDiff(Float theYDiff) {
		this.theYDiff = theYDiff;
	}
	public Float getTheZDiff() {
		return theZDiff;
	}
	public void setTheZDiff(Float theZDiff) {
		this.theZDiff = theZDiff;
	}
	public Float getTotalXdiff() {
		return totalXdiff;
	}
	public void setTotalXdiff(Float totalXdiff) {
		this.totalXdiff = totalXdiff;
	}
	public Float getTotalYDiff() {
		return totalYDiff;
	}
	public void setTotalYDiff(Float totalYDiff) {
		this.totalYDiff = totalYDiff;
	}
	public Float getTotalZDiff() {
		return totalZDiff;
	}
	public void setTotalZDiff(Float totalZDiff) {
		this.totalZDiff = totalZDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}
	
	
}

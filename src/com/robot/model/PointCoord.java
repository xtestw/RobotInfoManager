package com.robot.model;

import java.util.Date;


public class PointCoord {
	private int pcid;
	private String pointName;
	private String PGName;
	private int nop;
	private float twoc,ieovc,X,Y,Z;
	private float theXDiff;
	private float theYDiff;
	private float theZDiff;
	private float totalXdiff,totalYDiff,totalZDiff;
	private Date measureTime;
	
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
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
	public int getNop() {
		return nop;
	}
	public void setNop(int nop) {
		this.nop = nop;
	}
	public float getTwoc() {
		return twoc;
	}
	public void setTwoc(float twoc) {
		this.twoc = twoc;
	}
	public float getIeovc() {
		return ieovc;
	}
	public void setIeovc(float ieovc) {
		this.ieovc = ieovc;
	}
	public float getX() {
		return X;
	}
	public void setX(float x) {
		X = x;
	}
	public float getY() {
		return Y;
	}
	public void setY(float y) {
		Y = y;
	}
	public float getZ() {
		return Z;
	}
	public void setZ(float z) {
		Z = z;
	}
	public float getTheXDiff() {
		return theXDiff;
	}
	public void setTheXDiff(float theXDiff) {
		this.theXDiff = theXDiff;
	}
	public float getTheYDiff() {
		return theYDiff;
	}
	public void setTheYDiff(float theYDiff) {
		this.theYDiff = theYDiff;
	}
	public float getTheZDiff() {
		return theZDiff;
	}
	public void setTheZDiff(float theZDiff) {
		this.theZDiff = theZDiff;
	}
	public float getTotalXdiff() {
		return totalXdiff;
	}
	public void setTotalXdiff(float totalXdiff) {
		this.totalXdiff = totalXdiff;
	}
	public float getTotalYDiff() {
		return totalYDiff;
	}
	public void setTotalYDiff(float totalYDiff) {
		this.totalYDiff = totalYDiff;
	}
	public float getTotalZDiff() {
		return totalZDiff;
	}
	public void setTotalZDiff(float totalZDiff) {
		this.totalZDiff = totalZDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}
}

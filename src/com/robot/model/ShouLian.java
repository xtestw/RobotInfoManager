package com.robot.model;

import java.util.Date;

public class ShouLian {
	private int sLID;
	private String leftPointName;
	private String rightPointName;
	private String PGName;
	private int nop;
	private float shouLian;
	private float theSLDiff;
	private float totalSLDiff;
	private Date measureTime;
	public int getsLID() {
		return sLID;
	}
	public void setsLID(int sLID) {
		this.sLID = sLID;
	}
	public String getLeftPointName() {
		return leftPointName;
	}
	public void setLeftPointName(String leftPointName) {
		this.leftPointName = leftPointName;
	}
	public String getRightPointName() {
		return rightPointName;
	}
	public void setRightPointName(String rightPointName) {
		this.rightPointName = rightPointName;
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
	public float getShouLian() {
		return shouLian;
	}
	public void setShouLian(float shouLian) {
		this.shouLian = shouLian;
	}
	public float getTheSLDiff() {
		return theSLDiff;
	}
	public void setTheSLDiff(float theSLDiff) {
		this.theSLDiff = theSLDiff;
	}
	public float getTotalSLDiff() {
		return totalSLDiff;
	}
	public void setTotalSLDiff(float totalSLDiff) {
		this.totalSLDiff = totalSLDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}
	
}

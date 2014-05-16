package com.robot.model;

import java.util.Date;

public class ShouLian {
	private Integer sLID;
	private String leftPointName;
	private String rightPointName;
	private String PGName;
	private Integer nop;
	private Float shouLian;
	private Float theSLDiff;
	private Float totalSLDiff;
	private Date measureTime;
	public Integer getsLID() {
		return sLID;
	}
	public void setsLID(Integer sLID) {
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
	public Integer getNop() {
		return nop;
	}
	public void setNop(Integer nop) {
		this.nop = nop;
	}
	public Float getShouLian() {
		return shouLian;
	}
	public void setShouLian(Float shouLian) {
		this.shouLian = shouLian;
	}
	public Float getTheSLDiff() {
		return theSLDiff;
	}
	public void setTheSLDiff(Float theSLDiff) {
		this.theSLDiff = theSLDiff;
	}
	public Float getTotalSLDiff() {
		return totalSLDiff;
	}
	public void setTotalSLDiff(Float totalSLDiff) {
		this.totalSLDiff = totalSLDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}

}

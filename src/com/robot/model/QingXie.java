package com.robot.model;

import java.util.Date;

public class QingXie {
	private int QXID;
	private String topPointName;
	private String botPointName;
	private String PGName;
	private int nop;
	private float qingXie;
	private float theQXDiff;
	private float totalQXDiff;
	private Date measureTime;
	public int getQXID() {
		return QXID;
	}
	public void setQXID(int qXID) {
		QXID = qXID;
	}
	public String getTopPointName() {
		return topPointName;
	}
	public void setTopPointName(String topPointName) {
		this.topPointName = topPointName;
	}
	public String getBotPointName() {
		return botPointName;
	}
	public void setBotPointName(String botPointName) {
		this.botPointName = botPointName;
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
	public float getQingXie() {
		return qingXie;
	}
	public void setQingXie(float qingXie) {
		this.qingXie = qingXie;
	}
	public float getTheQXDiff() {
		return theQXDiff;
	}
	public void setTheQXDiff(float theQXDiff) {
		this.theQXDiff = theQXDiff;
	}
	public float getTotalQXDiff() {
		return totalQXDiff;
	}
	public void setTotalQXDiff(float totalQXDiff) {
		this.totalQXDiff = totalQXDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}
	
}

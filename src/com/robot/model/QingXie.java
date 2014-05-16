package com.robot.model;

import java.util.Date;

public class QingXie {
	private Integer QXID;
	private String topPointName;
	private String botPointName;
	private String PGName;
	private Integer nop;
	private Float qingXie;
	private Float theQXDiff;
	private Float totalQXDiff;
	private Date measureTime;
	public Integer getQXID() {
		return QXID;
	}
	public void setQXID(Integer qXID) {
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
	public Integer getNop() {
		return nop;
	}
	public void setNop(Integer nop) {
		this.nop = nop;
	}
	public Float getQingXie() {
		return qingXie;
	}
	public void setQingXie(Float qingXie) {
		this.qingXie = qingXie;
	}
	public Float getTheQXDiff() {
		return theQXDiff;
	}
	public void setTheQXDiff(Float theQXDiff) {
		this.theQXDiff = theQXDiff;
	}
	public Float getTotalQXDiff() {
		return totalQXDiff;
	}
	public void setTotalQXDiff(Float totalQXDiff) {
		this.totalQXDiff = totalQXDiff;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}

}

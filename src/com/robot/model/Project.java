package com.robot.model;

import java.util.Date;
public class Project {
		private String projectName;
		private String projectNote;
		private String projcetProperty;
		private Date createTime;
		private String createPlace;
		private String applyMachine;
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getProjectNote() {
			return projectNote;
		}
		public void setProjectNote(String projectNote) {
			this.projectNote = projectNote;
		}
		public String getProjcetProperty() {
			return projcetProperty;
		}
		public void setProjcetProperty(String projcetProperty) {
			this.projcetProperty = projcetProperty;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public String getCreatePlace() {
			return createPlace;
		}
		public void setCreatePlace(String createPlace) {
			this.createPlace = createPlace;
		}
		public String getApplyMachine() {
			return applyMachine;
		}
		public void setApplyMachine(String applyMachine) {
			this.applyMachine = applyMachine;
		}
}

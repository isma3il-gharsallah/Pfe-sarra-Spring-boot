package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Custom {

	@Id
	String taskStatus;
	String taskLabel  ;
	String taskLabelColor ;
	
	
	public Custom(String taskStatus, String taskLabel, String taskLabelColor) {
		super();
		this.taskStatus = taskStatus;
		this.taskLabel = taskLabel;
		this.taskLabelColor = taskLabelColor;
	}


	public Custom( ) {
		super();
 
	}


	public String getTaskStatus() {
		return taskStatus;
	}


	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}


	public String getTaskLabel() {
		return taskLabel;
	}


	public void setTaskLabel(String taskLabel) {
		this.taskLabel = taskLabel;
	}


	public String getTaskLabelColor() {
		return taskLabelColor;
	}


	public void setTaskLabelColor(String taskLabelColor) {
		this.taskLabelColor = taskLabelColor;
	}
     
     
	
}

package com.collaboration.model;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;
@Entity

public class OutputMessage extends Message {

	private Date time;
	
	public OutputMessage(Message original, Date time) {
		super(original.getId(), original.getMessage());
		this.time = time;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
}

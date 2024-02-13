package com.ty.tms.entity;

import java.time.LocalDateTime;
import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Task implements Comparator{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	private String description;
	private String status;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@CreationTimestamp
	private LocalDateTime created_dateTime;
	
	@UpdateTimestamp
	private LocalDateTime completed_dateTime;
	public void setCompleted_dateTime(LocalDateTime completed_dateTime) {
		this.completed_dateTime = completed_dateTime;
	}

	
	
}

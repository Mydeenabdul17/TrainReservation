package com.TrainTicketReservation.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int trainNo;
//	private String from;
	private long time;
	private String destination;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Train(int id, int trainNo, String from, long time, String destination) {
		super();
		this.id = id;
		this.trainNo = trainNo;
//		this.from = from;
		this.time = time;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
//	public String getFrom() {
//		return from;
//	}
//	public void setFrom(String from) {
//		this.from = from;
//	}
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainNo=" + trainNo + ", time=" + time + ", destination=" + destination + "]";
	}
	
}

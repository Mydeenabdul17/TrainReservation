package com.TrainTicketReservation.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
	private int pnrNo;
//	private String berth;
//	private String destination;
	@OneToOne
	@JoinColumn
	private Train Train;
	@OneToOne
	@JoinColumn
	private Passenger passenger;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Ticket(int pnrNo, com.TrainTicketReservation.dto.Train train) {
		super();
		this.pnrNo = pnrNo;
		Train = train;
	}


	public int getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}
	public Train getTrain() {
		return Train;
	}
	public void setTrain(Train train) {
		Train = train;
	}
	
	

	public Passenger getPassenger() {
		return passenger;
	}


	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}


	@Override
	public String toString() {
		return "Ticket [pnrNo=" + pnrNo + ", Train=" + Train + ", passenger=" + passenger + "]";
	}
	
	
}

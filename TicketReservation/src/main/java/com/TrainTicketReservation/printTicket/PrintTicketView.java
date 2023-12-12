package com.TrainTicketReservation.printTicket;

import java.util.Scanner;

import com.TrainTicketReservation.dto.Ticket;

public class PrintTicketView {

	Scanner sc= new Scanner(System.in);
	private PrintTicketViewModel model;
	public PrintTicketView() {
		model=new PrintTicketViewModel(this);
	}
	
	public void init() {
		getTicket();
	}
	private void getTicket() {
		System.out.println("Enter the pnr number");
		int pnr=sc.nextInt();
		model.getTicket(pnr);
	}

	public void ticketSuccess(Ticket t) {
		System.out.println("***************************************************************\n");
		System.out.println(t);
		System.out.println("***************************************************************\n");
	}

	public void ticketFail() {
		System.out.println("Ticket not present");
	}
}

package com.TrainTicketReservation.cancelTicket;

import java.util.Scanner;

public class CancelTicketView {

	Scanner sc =new Scanner(System.in);
	private CancelTicketViewModel cancelTicketViewModel;
	public CancelTicketView() {
		cancelTicketViewModel=new CancelTicketViewModel(this);
	}
	public void init() {
		cancelTicket();
	}
	private void cancelTicket() {
		System.out.println("Enter the pnr number");
		int pnr=sc.nextInt();
		cancelTicketViewModel.cancelTicket(pnr);
	}
	public void ticketCancelSuccess() {
		System.out.println("Ticket Canceled Successful");
	}
	public void ticketCancelFail() {
		System.out.println("Ticket not present");
	}
}

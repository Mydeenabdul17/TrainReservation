package com.TrainTicketReservation.printTicket;

import com.TrainTicketReservation.dto.Ticket;
import com.TrainTicketReservation.repository.TrainRepository;

public class PrintTicketViewModel {

	private PrintTicketView printTicketView;
	public PrintTicketViewModel(PrintTicketView printTicketView) {
		this.printTicketView=printTicketView;
	}
	public void getTicket(int pnr) {
		Ticket t=TrainRepository.getInstance().getTicket(pnr);
		if(t!=null) {
			printTicketView.ticketSuccess(t);
		}else {
			printTicketView.ticketFail();
		}
	}
	
	
}

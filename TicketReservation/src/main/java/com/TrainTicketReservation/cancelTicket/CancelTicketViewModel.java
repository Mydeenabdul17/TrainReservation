package com.TrainTicketReservation.cancelTicket;

import com.TrainTicketReservation.repository.TrainRepository;

public class CancelTicketViewModel {

	private CancelTicketView cancelTicketView;
	public CancelTicketViewModel(CancelTicketView cancelTicketView) {
		this.cancelTicketView=cancelTicketView;
	}
	public void cancelTicket(int pnr) {
		if(TrainRepository.getInstance().cancelTicket(pnr)) {
			cancelTicketView.ticketCancelSuccess();
		}else {
			cancelTicketView.ticketCancelFail();
		}
	}
}

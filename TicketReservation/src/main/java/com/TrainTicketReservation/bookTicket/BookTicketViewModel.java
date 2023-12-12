package com.TrainTicketReservation.bookTicket;

import com.TrainTicketReservation.dto.Passenger;
import com.TrainTicketReservation.dto.Ticket;
import com.TrainTicketReservation.repository.TrainRepository;

public class BookTicketViewModel {

	private BookTicketView bookTicketView;
	public BookTicketViewModel(BookTicketView bookTicketView) {
		this.bookTicketView=bookTicketView;
	}
	public void addPassengerDetails() {
		Passenger p=bookTicketView.getPassengerDetails();
		bookTicketView.addSuccess(TrainRepository.getInstance().addPassenger(p));
	}
	public void bookTicket(int choice) {
		bookTicketView.bookSuccess(TrainRepository.getInstance().bookTrain(choice));
	}
	public Ticket printTicket() {
		return TrainRepository.getInstance().printTicket();
	}
	

}

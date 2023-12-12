package com.TrainTicketReservation.bookTicket;

import java.util.Scanner;

import com.TrainTicketReservation.dto.Passenger;
import com.TrainTicketReservation.showTrainsAvailable.ShowTrainsView;

public class BookTicketView {

	Scanner sc=new Scanner(System.in);
	private BookTicketViewModel bookTicketViewModel;
	public BookTicketView() {
		bookTicketViewModel =new BookTicketViewModel(this);
	}
	
	public void init() {
		addPassengerDetails();
	}

	private void addPassengerDetails() {
		bookTicketViewModel.addPassengerDetails();
	}
	
	public Passenger getPassengerDetails() {
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your DOB (ddmmyyyy)");
		long dob=sc.nextLong();
		System.out.println("Enter your city");
		String city=sc.next();
		System.out.println("Enter your phone number");
		long phno=sc.nextLong();
		sc.nextLine();
		Passenger p=new Passenger();
		p.setCity(city);
		p.setDob(dob);
		p.setName(name);
		p.setPhno(phno);
		return p;
	}

	public void addSuccess(String addPassenger) {
		System.out.println(addPassenger);
		viewTrainDetails();
	}

	private void viewTrainDetails() {
		System.out.println("Choose train");
		new ShowTrainsView().listTrains();
		int choice=sc.nextInt();
		bookTicket(choice);
	}

	private void bookTicket(int choice) {
		bookTicketViewModel.bookTicket(choice);
	}

	public void bookSuccess(String bookTrain) {
		System.out.println(bookTrain);
		printTicket();
	}

	private void printTicket() {
		System.out.println(bookTicketViewModel.printTicket());
	}
}

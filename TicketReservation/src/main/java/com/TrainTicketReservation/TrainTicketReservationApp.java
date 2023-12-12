package com.TrainTicketReservation;

import java.util.Scanner;

import com.TrainTicketReservation.bookTicket.BookTicketView;
import com.TrainTicketReservation.cancelTicket.CancelTicketView;
import com.TrainTicketReservation.printTicket.PrintTicketView;
import com.TrainTicketReservation.showTrainsAvailable.ShowTrainsView;

public class TrainTicketReservationApp {

	public static void main(String[] args) {
		TrainTicketReservationApp app=new TrainTicketReservationApp();
		app.init();
	}
	
	public void init() {
		Scanner sc=new Scanner(System.in);
		CancelTicketView cancelTicketView=new CancelTicketView();
		ShowTrainsView showTrainsView=new ShowTrainsView();
		BookTicketView bookTicketView=new BookTicketView();
		PrintTicketView printTicketView=new PrintTicketView();
		System.out.println("Welcome to Train Ticket Reservation App");
		outer:do {
			System.out.println("Enter the choice");
			System.out.println("1.Trains Available\n2.Book Ticket\n3.Cancel Ticket\n4.Print Ticket\n5.Exit");
			switch(sc.nextInt()) {
			case 1:{
				showTrainsView.listTrains();
				break;
			}
			case 2:{
				bookTicketView.init();
				break;
			}
			case 3:{
				cancelTicketView.init();
				break;
			}
			case 4:{
				printTicketView.init();
				break;
			}
			case 5:{
				break outer;
			}
			}
		} while (true);
	}
}

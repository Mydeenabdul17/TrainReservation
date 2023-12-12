package com.TrainTicketReservation.showTrainsAvailable;

import java.util.List;

import com.TrainTicketReservation.dto.Train;

public class ShowTrainsView {

	private ShowTrainsViewModel showTrainsViewModel;
	public ShowTrainsView() {
		this.showTrainsViewModel=new ShowTrainsViewModel(this);
	}
	public void listTrains() {
		showTrainsViewModel.trains();
	}
	
	public void trainsAvailable(List<Train> trains) {
		int i=1;
		for(Train train:trains) {
			System.out.println(i++ +" - "+train);
		}
	}
	
	public void trainNotAvailable() {
		System.out.println("No trains available");
	}
}

package com.TrainTicketReservation.showTrainsAvailable;

import java.util.List;

import com.TrainTicketReservation.dto.Train;
import com.TrainTicketReservation.repository.TrainRepository;

public class ShowTrainsViewModel {

	private ShowTrainsView showTrainsView;
	
	public ShowTrainsViewModel(ShowTrainsView showTrainsView) {
		this.showTrainsView=showTrainsView;
	}
	
	public void trains(){
		List<Train> trains=TrainRepository.getInstance().trains();
		if(trains==null) {
			showTrainsView.trainNotAvailable();
		}else {
			showTrainsView.trainsAvailable(trains);
		}
	}
}

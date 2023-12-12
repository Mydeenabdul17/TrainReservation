package com.TrainTicketReservation.addTrain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.TrainTicketReservation.dto.Train;

public class AddTrain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Train t=new Train();
		t.setTrainNo(24);
		t.setTime(5);
		t.setDestination("bangalore");
		
		et.begin();
		em.persist(t);
		et.commit();
	}
}

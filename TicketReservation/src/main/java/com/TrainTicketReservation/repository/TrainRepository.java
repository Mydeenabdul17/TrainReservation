package com.TrainTicketReservation.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.TrainTicketReservation.dto.Passenger;
import com.TrainTicketReservation.dto.Ticket;
import com.TrainTicketReservation.dto.Train;

public class TrainRepository {
    
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	private EntityManager em=emf.createEntityManager();
	private EntityTransaction et=em.getTransaction();
	private static TrainRepository trainRepository;
	private List<Train> trains;
	private Passenger p;
	private Ticket t;
	private TrainRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Train> trains(){
		if(trains==null) {

			Query q = em.createQuery("select t from Train t");
			
			trains = q.getResultList();
		}
		return trains;
	}
	public static TrainRepository getInstance() {
		if(trainRepository==null) {
			trainRepository=new TrainRepository();
		}
		return trainRepository;
	}
	public String addPassenger(Passenger p) {
		this.p=p;
		
		et.begin();
		em.persist(p);
		et.commit();
		
		return "Data added";
	}

	public String bookTrain(int choice) {
		
		t=new Ticket();
		t.setTrain(trains.get(choice-1));
		t.setPassenger(p);
		
		et.begin();
		em.persist(t);
		et.commit();
		
		return "Booked Successful";
	}
	
	public Ticket getTicket(int pnr) {
		
		Ticket t = em.find(Ticket.class, pnr);
		
		return t;
	}

	public Ticket printTicket() {
		return t;
	}

	public boolean cancelTicket(int pnr) {
		
		Ticket t=getTicket(pnr);
		if(t!=null) {
			et.begin();
			em.remove(t);
			et.commit();
			return true;
		}
		return false;
	}
}

package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Flight;

public class FlightDbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		
		Flight f = new Flight();
		f.setFlightName("indigo");
		f.setFromLocation("pune");
		f.setToLocation("delhi");
		f.setDepartureDate(LocalDate.of(2019,9,28 ));
		f.setArrivalDate(LocalDate.of(2019, 9, 28));
		f.setDepartureTime(LocalTime.of(21, 30));
		f.setArrivalTime(LocalTime.of(23, 30));
		f.setDuration(2f);
		f.setTotalSeats(30);
		
		s.save(f);
		t.commit();
		s.close();

	}

}

package com.flamingo.main;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.Flight;
import com.flamingo.entities.Passenger;
import com.flamingo.entities.UserLogin;

public class FlightDbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Configuration c1 = new Configuration().configure();
		SessionFactory sf1 = c1.buildSessionFactory();
		Session s1 = sf1.openSession();
		Transaction t1 = s1.beginTransaction();
		
		
		/*
		 * Flight f = new Flight(); f.setFlightName("goAir");
		 * f.setFromLocation("mumbai"); f.setToLocation("delhi");
		 * f.setDepartureDate(LocalDate.of(2019,9,29 ));
		 * f.setArrivalDate(LocalDate.of(2019, 9, 29));
		 * f.setDepartureTime(LocalTime.of(21, 30)); f.setArrivalTime(LocalTime.of(23,
		 * 30)); f.setDuration(2f); f.setTotalSeats(30);
		 * 
		 * s.save(f);
		 */
		Passenger p =new Passenger();
		p.setFname("N");
		 p.setMname("akansh"); 
		p.setLname("akansh sai");
		p.setAddress("pune");
		p.setEmailId("aaa");
		p.setPhoneNo(456);
	
		UserLogin u = new UserLogin();
		
		u.setUsername("aksnhs");
		u.setPassword("asdaw");
		
	u.setProfile(p);
	p.setUser(u);
		
	s1.save(p);
		s1.save(u);
		
		
		
		t1.commit();
		s1.close();

	}

}
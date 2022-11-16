package com.example.ticketsbackend;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketsBackendApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TicketsBackendApplication.class, args);
		Flight[] flights = new Flight[30];
		flights[0] = new Flight("Ryanair", 23, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		flights[1] = new Flight("Vlee", 23, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		flights[2] = new Flight("Aaa", 23, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		flights[3] = new Flight("Ryanair", 23, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		
		
		Flight[] db;
		db = FlightsApp.getInstance();
		System.out.println("*****************                *******************");
		
		for (int i=0; i<20; i++) {
			System.out.println(db[i].toString());
		}
		
		System.out.println("*****************                *******************");
		
		LocalTime time2 = LocalTime.of(7, 20, 45, 342123342);
        System.out.println(time2);
		
		
	}

}

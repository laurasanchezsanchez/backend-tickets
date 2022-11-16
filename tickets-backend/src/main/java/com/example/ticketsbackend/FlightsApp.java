package com.example.ticketsbackend;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FlightsApp {

	private static FlightsApp singleObject;
	
	public static Flight[] getInstance() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		Flight[] flights = new Flight[20];
		flights[0] = new Flight("Ryanair", 1, LocalTime.of(9, 00), LocalDate.of(2022, 12, 14) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		flights[1] = new Flight("Iberia", 2, LocalTime.of(9, 00), LocalDate.of(2022, 12, 15) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Sevilla", "Madrid");
		flights[2] = new Flight("Descapada", 3, LocalTime.of(9, 00), LocalDate.of(2022, 12, 16) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Sevilla", "Malaga");
		flights[3] = new Flight("Ryanair", 4, LocalTime.of(9, 00), LocalDate.of(2022, 12, 17) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Sevilla", "Valencia");
		flights[4] = new Flight("Iberia", 5, LocalTime.of(9, 00), LocalDate.of(2022, 12, 18) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Madrid", "Sevilla");
		
		
		flights[5] = new Flight("Ryanair", 6, LocalTime.of(9, 00), LocalDate.of(2022, 11, 14), LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Barcelona", "Sevilla");
		flights[6] = new Flight("Iberia", 7, LocalTime.of(9, 00), LocalDate.of(2022, 11, 15) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Madrid", "Barcelona");
		flights[7] = new Flight("Descapada", 8, LocalTime.of(9, 00), LocalDate.of(2022, 11, 16) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Malaga", "Sevilla");
		flights[8] = new Flight("Ryanair", 9, LocalTime.of(9, 00), LocalDate.of(2022, 11, 17), LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Valencia", "Sevilla");
		flights[9] = new Flight("Iberia", 10, LocalTime.of(9, 00), LocalDate.of(2022, 11, 18) , LocalTime.of(2, 20), 3, true, 25.00, 500.00, "Sevilla", "Madrid");
		
		
		// IBIZA - SEVILLA
		flights[10] = new Flight("Ryanair", 11, LocalTime.of(12, 00), LocalDate.of(2022, 10, 20) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Sevilla", "Ibiza");
		flights[11] = new Flight("Iberia", 12, LocalTime.of(12, 00), LocalDate.of(2022, 10, 22) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Sevilla", "Ibiza");
		flights[12] = new Flight("Descapada", 13, LocalTime.of(12, 00), LocalDate.of(2022, 10, 21), LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Sevilla", "Ibiza");
		flights[13] = new Flight("Ryanair", 14,LocalTime.of(12, 00), LocalDate.of(2022, 10, 25) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Sevilla", "Ibiza");
		flights[14] = new Flight("Iberia", 15, LocalTime.of(12, 00), LocalDate.of(2022, 10, 26) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Sevilla", "Ibiza");
		
		
		flights[15] = new Flight("Ryanair", 16, LocalTime.of(21, 00), LocalDate.of(2022, 10, 14), LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		flights[16] = new Flight("Iberia", 17, LocalTime.of(21, 00), LocalDate.of(2022, 10, 15) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		flights[17] = new Flight("Descapada", 18, LocalTime.of(21, 00), LocalDate.of(2022, 10, 16) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		flights[18] = new Flight("Ryanair", 19, LocalTime.of(21, 00), LocalDate.of(2022, 10, 18) , LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		flights[19] = new Flight("Iberia", 20, LocalTime.of(21, 00), LocalDate.of(2022, 10, 3), LocalTime.of(4, 20), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		
		//flights[20] = new Flight("Iberia", 21, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Ibiza", "Sevilla");
		
		
		return flights;
	}
}

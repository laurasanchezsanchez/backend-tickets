package com.example.ticketsbackend;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
	private String Company;
	private int NumberFlight;
	private LocalTime Hour;
	private LocalDate Day;
	private LocalTime TimeOfFlight;
	private int NumberOfLayover;
	// Permite equipaje
	private boolean Luggage;
	private double PriceOfLuggage;
	private double Price;
	private String Origin;
	private String Destination;
	
	
	public Flight(String company, int numberFlight, LocalTime hour, LocalDate day, LocalTime timeOfFlight,
			int numberOfLayover, boolean luggage, double priceOfLuggage, double price, String origin, String destination) {
		super();
		Company = company;
		NumberFlight = numberFlight;
		Hour = hour;
		Day = day;
		TimeOfFlight = timeOfFlight;
		NumberOfLayover = numberOfLayover;
		Luggage = luggage;
		setPriceOfLuggage(priceOfLuggage);
		Price = price;
		setOrigin(origin);
		setDestination(destination);
	}
	


	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getNumberFlight() {
		return NumberFlight;
	}
	public void setNumberFlight(int numberFlight) {
		NumberFlight = numberFlight;
	}
	public LocalTime getHour() {
		return Hour;
	}
	public void setHour(LocalTime hour) {
		Hour = hour;
	}
	public LocalDate getDay() {
		return Day;
	}
	public void setDay(LocalDate day) {
		Day = day;
	}
	public LocalTime getTimeOfFlight() {
		return TimeOfFlight;
	}
	public void setTimeOfFlight(LocalTime timeOfFlight) {
		TimeOfFlight = timeOfFlight;
	}
	public int getNumberOfLayover() {
		return NumberOfLayover;
	}
	public void setNumberOfLayover(int numberOfLayover) {
		NumberOfLayover = numberOfLayover;
	}
	public boolean isLuggage() {
		return Luggage;
	}
	public void setLuggage(boolean luggage) {
		Luggage = luggage;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}



	public double getPriceOfLuggage() {
		return PriceOfLuggage;
	}



	public void setPriceOfLuggage(double priceOfLuggage) {
		PriceOfLuggage = priceOfLuggage;
	}



	public String getDestination() {
		return Destination;
	}



	public void setDestination(String destination) {
		Destination = destination;
	}



	public String getOrigin() {
		return Origin;
	}



	public void setOrigin(String origin) {
		Origin = origin;
	}
	
	
	@Override
    public String toString() {
        return "{" +
                "Company='" + Company + '\'' +
                ", Number Flight='" + NumberFlight + '\'' +
                ", Hour=" + Hour + '\'' +
                ", Day=" + Day + '\'' +
                ", Time Of Flight=" + TimeOfFlight + '\'' +
                ", NumberOfLayover =" + NumberOfLayover + '\'' +
                ", Luggage=" + Luggage + '\'' +
                ", PriceOfLuggage=" + PriceOfLuggage + '\'' +
                ", Price=" + Price + '\'' +
                ", Origin=" + Origin + '\'' +
                ", Destination=" + Destination + '\'' +
                '}';
    }
	
	
	
	

}

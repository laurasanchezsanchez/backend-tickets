package com.example.ticketsbackend;

public class ItemTicket {

	private Person person;
	private Flight flight;
	private double priceTicket;
	
	
	public ItemTicket(Person person, Flight flight2) {
		this.person = person;
		this.flight = flight2;
		double TotalPrice = flight2.getPriceOfLuggage() + flight2.getPrice();
		
		int age = person.getEdad();
		if (age < 2) {
			priceTicket = 0;
		}else if (age >= 2 && age <=9) {
			// Se hace descuento
			priceTicket =  TotalPrice * 0.85;
		}else {
			priceTicket =  TotalPrice;			
		}
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public double getPriceTicket() {
		return priceTicket;
	}
	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}
}

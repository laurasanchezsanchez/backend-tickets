package com.example.ticketsbackend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketsBackendApplicationTests {

	
	private static final String Flight = null;

	public String setName(String name) {
		if (name == "Manuel")
			return "FAIL";
		else
			return "OK";
	}
	
	@Test
	public void setName_WhenItsFail_ShowError() {
		String name = "Manuel";
		assertEquals("FAIL", setName(name));
	}
	
	@Test
	public void setName_WhenItsOk_ShowOk() {
		String name = "Sofia";
		assertEquals("OK", setName(name));
	}
	
	@Test
	public void getPrice_WhenItsYoungerThanTwho_NoPay() {
		
		Person children = new Person ("Patricia", "Sanchez Sanchez", "España", "26555877A", 1);
		Flight f = new Flight("Ryanair", 23, LocalTime.now(), LocalDate.now() , LocalTime.now(), 3, true, 25.00, 500.00, "Sevilla", "Barcelona");
		ItemTicket item = new ItemTicket(children, f);
		assertEquals(0, item.getPriceTicket());
	}

	

}

package com.example.ticketsbackend;

public class Person {

	private String Name;
	private String Surname;
	private String Nationality;
	private String DNI;
	private int edad;
	
	
	
	public Person(String name, String surname, String nationality, String dNI, int edad) {
		super();
		Name = name;
		Surname = surname;
		Nationality = nationality;
		DNI = dNI;
		this.edad = edad;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

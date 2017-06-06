package com.carRental.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String registrationNumber;
	
	@NotNull
	private String model;
	
	@NotNull
	private String color;
	
	@OneToMany(mappedBy = "car")
	private Set<Rental> rentals = new HashSet<Rental>(0);
	
	public Car() {
	}
	
	public Car(long id) {
		this.id = id;
	}
	
	public Set<Rental> getRentals()  {
		return this.rentals;
	}
	
}
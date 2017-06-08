package com.carRental.model.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String registrationNumber;
	
	@NotNull
	private String model;
	
	@NotNull
	private String color;
	
	@OneToMany(mappedBy = "car")
	@JsonBackReference
	private List<Rental> rentals = new ArrayList<Rental>(0);
	
	public Car() {
	}
	
	public Car(int id) {
		this.id = id;
	}
	
	public List<Rental> getRentals()  {
		return this.rentals;
	}
	
}

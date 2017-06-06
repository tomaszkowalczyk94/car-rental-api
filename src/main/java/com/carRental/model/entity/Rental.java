package com.carRental.model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rentals")
public class Rental {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private Date startRental;
	
	private Date endRental;
	
	
	@ManyToOne()
	@NotNull
	private User user;
	
	@ManyToOne()
	@NotNull
	private Car car;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartRental() {
		return startRental;
	}

	public void setStartRental(Date startRental) {
		this.startRental = startRental;
	}

	public Date getEndRental() {
		return endRental;
	}

	public void setEndRental(Date endRental) {
		this.endRental = endRental;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


	
}

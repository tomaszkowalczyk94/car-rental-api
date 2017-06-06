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
	private long id;

	@NotNull
	private Date startRental;
	
	private Date endRental;
	
	
	@ManyToOne()
	@NotNull
	private User user;
	
	@ManyToOne()
	@NotNull
	private Car car;
	
}

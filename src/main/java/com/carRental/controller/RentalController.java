package com.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carRental.model.dao.DaoInterface;
import com.carRental.model.dao.RentalDao;
import com.carRental.model.entity.Rental;

@RestController
@RequestMapping("rentals")
public class RentalController extends EntityController<Rental, Integer>
		implements EntityControllerInterface<Rental, Integer> {

	@Autowired
	private RentalDao rentalDao;
	
	@Override
	protected DaoInterface<Rental, Integer> getDao() {
		return rentalDao;
	}
}

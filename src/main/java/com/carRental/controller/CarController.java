package com.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carRental.model.dao.CarDao;
import com.carRental.model.dao.DaoInterface;
import com.carRental.model.entity.Car;

@RestController
@RequestMapping("cars")
public class CarController extends EntityController<Car, Integer> implements EntityControllerInterface<Car, Integer> {
	
	@Autowired
	private CarDao carDao;
	
	@Override
	protected DaoInterface<Car, Integer> getDao() {
		return carDao;
	}

}

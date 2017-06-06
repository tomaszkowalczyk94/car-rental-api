package com.carRental.model.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.Car;

@Transactional
@Repository
public class CarDao extends AbstractHibernateDao<Car, Integer> {

}

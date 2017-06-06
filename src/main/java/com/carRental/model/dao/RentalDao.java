package com.carRental.model.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.Rental;

@Transactional
@Repository
public class RentalDao extends AbstractHibernateDao<Rental, Integer> {

}

package com.carRental.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.Car;
import com.carRental.model.entity.Rental;

@Transactional
@Repository
public class RentalDao extends AbstractHibernateDao<Rental, Integer> implements DaoInterface<Rental, Integer> {

	@Override
	public List<Rental> getAll() {
		return this.entityManager.createQuery("SELECT r FROM Rental r").getResultList();
	}

}

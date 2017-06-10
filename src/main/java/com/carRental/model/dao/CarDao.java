package com.carRental.model.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.Car;

@Transactional
@Repository
public class CarDao extends AbstractHibernateDao<Car, Integer> implements DaoInterface<Car, Integer> {

	@Override
	public List<Car> getAll() {
		return this.entityManager.createQuery("SELECT c FROM Car c").getResultList();
	}

	@Override
	public boolean isExist(Car car) {
		Query query = this.entityManager.createQuery("SELECT count(c) FROM Car c WHERE c.registrationNumber = :registrationNumber")
		.setParameter("registrationNumber", car.getRegistrationNumber());
		
		Long count = (Long)query.getSingleResult(); 
		return (count == 1);
	}

}

package com.carRental.model.dao;

import java.util.List;

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
	public boolean isExist(Car t) {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.carRental.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.User;

@Transactional
@Repository
public class UserDao{
	@PersistenceContext	
	private EntityManager entityManager;
	
	public User getUserById(int userId) {
		return entityManager.find(User.class, userId);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		String hql = "FROM User as u";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}
}

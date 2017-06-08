package com.carRental.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.User;

@Transactional
@Repository
public class UserDao extends AbstractHibernateDao<User, Integer> implements DaoInterface<User, Integer> {
	
	public List<User> getAll() {
		return this.entityManager.createQuery("SELECT u FROM User u").getResultList();
	}

	@Override
	public boolean isExist(User user) {
		
		Query query = this.entityManager.createQuery("SELECT count(u) FROM User u WHERE u.username = :username OR u.email = :email")
		.setParameter("username", user.getUsername())
		.setParameter("email", user.getEmail());
		
		Long count = (Long)query.getSingleResult(); 
		return (count == 1);
	}
	
}

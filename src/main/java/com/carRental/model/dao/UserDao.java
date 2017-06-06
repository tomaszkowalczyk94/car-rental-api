package com.carRental.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carRental.model.entity.User;

@Transactional
@Repository
public class UserDao extends AbstractHibernateDao<User, Integer> {

}

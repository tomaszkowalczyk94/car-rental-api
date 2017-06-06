package com.carRental.model.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractHibernateDao<T, PK> {
	
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public AbstractHibernateDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
             .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
	
	@PersistenceContext
	protected EntityManager entityManager;

	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	public T get(PK id) {
		return this.entityManager.find(entityClass, id);
	}

	public T update(T t) {
		return this.entityManager.merge(t);
	}
	
	
	public void delete(T t) {
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}
}

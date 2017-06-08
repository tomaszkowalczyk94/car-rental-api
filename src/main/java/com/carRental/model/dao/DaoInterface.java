package com.carRental.model.dao;

import java.util.List;

import com.carRental.model.entity.User;

public interface DaoInterface<T, PK> {

	public T create(T t);

	public T get(PK id);
	
	public List<T> getAll();

	public T update(T t);

	public void delete(T t);
	
	
}

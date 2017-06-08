package com.carRental.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carRental.model.dao.DaoInterface;
import com.carRental.model.entity.User;

public abstract class EntityController<T, PK> {
	
	protected abstract DaoInterface getDao();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<T>> getAll() {
		List<T> entities = getDao().getAll();

		if (entities.isEmpty()) {
			return new ResponseEntity<List<T>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<T>>(entities, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity getEntity(@PathVariable PK id) {
		T entity = (T) getDao().get(id);

		if (entity == null) {
			return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<T>(entity, HttpStatus.OK);
	}
}
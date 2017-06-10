package com.carRental.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.carRental.model.entity.User;

public interface EntityControllerInterface<T, PK> {
	
	public ResponseEntity<List<T>> getAll();
	
	public ResponseEntity<T> getEntity(PK id);
	
	public ResponseEntity<T> updateUser(@PathVariable("id") PK id, @RequestBody T entity);
	
	public ResponseEntity<T> deleteEntity(@PathVariable("id") PK id);
}

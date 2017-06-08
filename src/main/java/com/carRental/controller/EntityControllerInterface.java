package com.carRental.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.carRental.model.entity.User;

public interface EntityControllerInterface<T, PK> {
	public ResponseEntity<List<T>> getAll();
	
	public ResponseEntity getEntity(@PathVariable PK id);
}

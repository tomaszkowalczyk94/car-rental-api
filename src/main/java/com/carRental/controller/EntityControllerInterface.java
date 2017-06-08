package com.carRental.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface EntityControllerInterface<T, PK> {
	
	public ResponseEntity<List<T>> getAll();
	
	public ResponseEntity<T> getEntity(@PathVariable PK id);
}

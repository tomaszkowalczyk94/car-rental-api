package com.carRental.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.carRental.model.dao.DaoInterface;
import com.carRental.model.entity.EntityInterface;
import com.carRental.model.entity.User;

public abstract class EntityController<T extends EntityInterface<PK>, PK> {
	
	protected abstract DaoInterface<T, PK> getDao();
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<List<T>> getAll() {
		List<T> entities = getDao().getAll();

		if (entities.isEmpty()) {
			return new ResponseEntity<List<T>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<T>>(entities, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<T> getEntity(@PathVariable PK id) {
		T entity = (T) getDao().get(id);

		if (entity == null) {
			return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<T>(entity, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<T> createEntity(@RequestBody T entity) {
        if (getDao().isExist(entity)) {
            return new ResponseEntity<T>(HttpStatus.CONFLICT);
        }
 
        getDao().create(entity);
        return new ResponseEntity<T>(HttpStatus.CREATED);
    }
	
	
	
	//todo validacja
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<T> updateUser(@PathVariable("id") PK id, @RequestBody T entity) {
         
        T currentEntity = getDao().get(id);
         
        if (currentEntity==null) {
            return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
        } 
        entity.setId(id);
        getDao().update(entity);
        return new ResponseEntity<T>(entity, HttpStatus.OK);
    }
    
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<T> deleteEntity(@PathVariable("id") PK id) {

        T entity = getDao().get(id);
        if (entity == null) {
            return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
        }
 
        getDao().delete(entity);
        return new ResponseEntity<T>(HttpStatus.NO_CONTENT);
    }
 
}

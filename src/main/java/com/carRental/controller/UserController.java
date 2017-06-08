package com.carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carRental.model.dao.DaoInterface;
import com.carRental.model.dao.UserDao;
import com.carRental.model.entity.User;

@RestController
@RequestMapping("users")
public class UserController extends EntityController<User, Integer> implements EntityControllerInterface<User, Integer> {
	
	
	@Autowired
	private UserDao userDao;

	@Override
	protected DaoInterface getDao() {
		return this.userDao;
	}

	
		
}

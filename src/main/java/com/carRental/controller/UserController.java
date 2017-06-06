package com.carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carRental.model.dao.UserDao;
import com.carRental.model.entity.User;

@RestController
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = userDao.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	@RequestMapping("/test")
	public String hello() {
		return "Hello ";
	}
	
}

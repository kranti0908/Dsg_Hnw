package com.dsg_hnw.dsg_hnw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsg_hnw.dsg_hnw.entities.User;
import com.dsg_hnw.dsg_hnw.services.UserInterface;

@RestController
public class UserEnquiry {
	
	@Autowired
	private UserInterface userService;
	
		
	@PostMapping("/userEnquiry")
	public User userEnquiry(@RequestBody User users) {
		System.out.println("USER"+users);
		return this.userService.addUserRegistration(users);
	}
}

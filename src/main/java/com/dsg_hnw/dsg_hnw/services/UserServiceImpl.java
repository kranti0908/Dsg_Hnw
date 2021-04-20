package com.dsg_hnw.dsg_hnw.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsg_hnw.dsg_hnw.entities.User;

@Service
public class UserServiceImpl implements UserInterface {

	
	
	@Override
	public User addUserRegistration(User users) {
		List<User> list=null;
		list = new ArrayList<User>();
		list.add(users);
		return users;
	}

}

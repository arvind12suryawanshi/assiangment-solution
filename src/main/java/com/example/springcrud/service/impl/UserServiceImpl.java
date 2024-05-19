package com.example.springcrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcrud.entity.User;
import com.example.springcrud.repository.UserRepository;
import com.example.springcrud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
    private UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		
		userRepository.save(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}

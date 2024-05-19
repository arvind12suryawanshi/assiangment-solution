package com.example.springcrud.service;

import java.util.List;

import com.example.springcrud.entity.User;

public interface UserService {

	void addUser(User user);

	List<User> getUsers();

}

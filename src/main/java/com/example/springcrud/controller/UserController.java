package com.example.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcrud.entity.User;
import com.example.springcrud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	    @Autowired
	    private UserService userService;
	    
	    
	    /**
	     * add user
	     */

	    @PostMapping("/add")
	    public String addUser(@RequestBody User user) {
	        userService.addUser(user);

	        return "success add user";
	    }
	    

	    /**
	     * get users as list
	     */

	    @GetMapping
	    public List<User> getUsers() {
	        return userService.getUsers();
	    }
}

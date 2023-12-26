package com.pitProcrumentService.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pitProcrumentService.entity.PurchaseOrder;
import com.pitProcrumentService.entity.User;
import com.pitProcrumentService.service.UserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
	@Autowired
	private UserService userService; 

	@GetMapping("/api/User/{id}")
	@ResponseStatus(value=HttpStatus.OK, reason="user getId successfully")
	public User getUsers(@PathVariable Integer id) {    
	    return userService.getUserById(id);
	}


    @GetMapping("/api/User")
   // @ResponseStatus(value=HttpStatus.OK,reason="user getall succesfully")
    public List<User> getUser() {    
    	return  userService.getUsers();
    }
	@PostMapping("/api/User")
	@ResponseStatus(value=HttpStatus.OK, reason="user create successfully")
	public User createUser(@RequestBody User user) {
	    return userService.createUser(user);
	}

	@PutMapping("/api/User/{id}")
	@ResponseStatus(value = HttpStatus.OK, reason="user update successfully")
	public User updateUser(@RequestBody User user) {
	    return userService.updateUser(user);
	}


}

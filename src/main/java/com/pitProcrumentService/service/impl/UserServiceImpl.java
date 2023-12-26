package com.pitProcrumentService.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitProcrumentService.entity.User;
import com.pitProcrumentService.repository.UserRepository;
import com.pitProcrumentService.service.UserService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor

public  class UserServiceImpl implements UserService {

	@Autowired(required=true)
	private UserRepository userRepository;
	

	public User getUserById(Integer id) {
		User user = new User();
		return user;
	}
public List<User> getUserOrders() {
		return userRepository.findAll();
	}
public User getUserOrder(Integer id) {
		//return userRepository.getPObyUser(id);
	return null;
	}
@Override
	public Optional<User> putUserById(Integer id) {
		return userRepository.findById(id);
	}
public User updateUser(User user) {
		return userRepository.save(user);
	}
@Override
public User createUser(User user) {
		return userRepository.save(user);
	}
@Override
	public void deleteUser(Integer id) {
		 userRepository.deleteById(id); 

	}
@Override
public List<User> getUsers() {
	// TODO Auto-generated method stub
	return null;
}


	
	

	
	}



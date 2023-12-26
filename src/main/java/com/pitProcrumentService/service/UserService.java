package com.pitProcrumentService.service;

import java.util.List;
import java.util.Optional;


import com.pitProcrumentService.entity.User;

public interface UserService {
	

	    User getUserById(Integer id);
	    User getUserOrder (Integer id);
	    List<User> getUsers();

	    Optional<User> putUserById(Integer id);

	    User updateUser(User user);

	    User createUser(User user);

	    void deleteUser(Integer id);
	    
	    
	}


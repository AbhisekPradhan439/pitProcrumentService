package com.pitProcrumentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pitProcrumentService.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	//@Query("SELECT user.id from user where user.id=:id")
	//public User getPObyUser(Integer id);
	

}

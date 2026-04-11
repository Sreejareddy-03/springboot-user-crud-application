package com.jsp.springboot_user_crud_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsp.springboot_user_crud_app.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);
   
    @Query("select u from User u where email=?1 and password=?2")
    User login(String email,String password);
	
}

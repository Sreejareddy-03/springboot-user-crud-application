package com.jsp.springboot_user_crud_app.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot_user_crud_app.dto.User;
import com.jsp.springboot_user_crud_app.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
   private UserRepository repository;
   
   public void saveUser(User user) {
	 repository.save(user);
}
//   public Optional<User> findUser(int uid) {
//	return repository.findById(uid);
//}
   
   public User findUserById(int id) {
	return repository.findById(id);
}
   
   public User updateUser(User user) {
    User optional=repository.findById(user.getUid());
    if(optional!=null) {
    	return repository.save(user);
    }else {
    	return null;
    }
}

public void deleteById(int uid) {
	User optional=repository.findById(uid);
	if(optional!=null) {
		 repository.deleteById(uid);
		
	}else {
		System.out.println("id not found");
	}	
}

public User login(User user) {
	return repository.login(user.getEmail(), user.getPassword());
}
}

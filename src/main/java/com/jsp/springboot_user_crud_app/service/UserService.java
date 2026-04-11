package com.jsp.springboot_user_crud_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot_user_crud_app.dao.UserDao;
import com.jsp.springboot_user_crud_app.dto.User;

@Service
public class UserService {
   @Autowired
	private UserDao dao;
	
	public void saveUser(User user) {
		dao.saveUser(user);
	}
//	public Optional<User> findUser(int uid) {
//		return dao.findUser(uid);
//	}
	
	public User findUserById(int id) {
		return dao.findUserById(id);
	}
	public User updateUser(User user) {
		return dao.updateUser(user);
	}

	public void deleteById(int uid) {
		 dao.deleteById(uid);
	}
	
	public User login(User user) {
		return dao.login(user);
	}

	
	
	
}

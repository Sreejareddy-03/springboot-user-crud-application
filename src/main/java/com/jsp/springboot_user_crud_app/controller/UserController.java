package com.jsp.springboot_user_crud_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_user_crud_app.dto.User;
import com.jsp.springboot_user_crud_app.service.UserService;

@RestController
public class UserController {
    @Autowired
	private UserService service;
	
    @PostMapping("/saveuser")
	public void saveUser(@RequestBody User user) {
		 service.saveUser(user);
	}
//    @GetMapping("/finduser/uid")
//    public Optional<User> findUser(@RequestParam int uid) {
//		return service.findUser(uid);
//	}
    @GetMapping("/finduser/{id}")
    public User findUserById(@PathVariable int id) {
		return service.findUserById(id);
	}
    
    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
    @DeleteMapping("/deleteuser/uid")
    public void deleteById(@RequestParam int uid) {
		 service.deleteById(uid);
	}
    
    @PostMapping("/loginuser")
    public User login(@RequestBody User user) {
		return service.login(user);
	}
   
}

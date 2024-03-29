package com.raihan.user_service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.raihan.user_service.model.Contact;
import com.raihan.user_service.model.User;
import com.raihan.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String home(){
        return "Hello World!";
    }
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user=this.userService.getUser(userId)	;
		//http://localhost:9002/contact/1001
		
		List contact=this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
				
				user.setContacts(contact);
	return user;
	}
	
	

}

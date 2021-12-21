package com.raihan.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raihan.user_service.model.User;

@Service
public class UserServiceIml implements UserService{
	
	List<User> list=List.of(
			new User(1001L,"Raihan Mahamud","01816028491"),
			new User(1002L,"Rasel Mahamud","01816028492"),
			new User(1003L,"Salman Mahamud","01816028493"),
			new User(1004L,"Emon Mahamud","01816028494")
			
			
			);

	@Override
	public User getUser(Long userId) {		
		
		return this.list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}

}

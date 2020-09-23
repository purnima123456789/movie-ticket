package com.capgemini.User2.service;

import org.springframework.stereotype.Service;

import com.capgemini.User2.entity.User;

@Service
public interface IUserService {
	
	public boolean RegisterUser(User user);

	public String login1(User auth);

}

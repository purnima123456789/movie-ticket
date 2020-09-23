package com.capgemini.User2.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.User2.repository.UserRepository;


import com.capgemini.User2.dao.userDao;
import com.capgemini.User2.entity.User;


@Service
public class UserServiceImpl implements IUserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	userDao UserDao;

	
	
	public boolean RegisterUser(User user) {
		Optional<User> userOptional = UserDao.register(user.getEmail());
		if(userOptional.isPresent()){
			return false;
		}
		else
		{
			UserDao.saveUser(user);
			return true;	
		}
	}
	
	
//	public User RegisterUser(User user) {
//		
//		return userRepository.save(user);
//	}


	public String login1(User userEntityObj) {

		
      String returnString = "Invalid Credentials";
		
		try
		{
		   User userEntity = userRepository.findById(userEntityObj.getUserId()).get();
		System.out.println(userEntity);
		  if(userEntityObj.getUserPassword().equals(userEntity.getUserPassword()) && userEntityObj.getUserType().equals(userEntity.getUserType()))
			{
				returnString="Login Successful";
			 
				return returnString;
			}
		else if(userEntityObj.getUserPassword().equals(userEntity.getUserPassword())||!userEntityObj.getUserType().equals(userEntity.getUserType()))
		{
			returnString="invalid userType";
			return  returnString;
		}

		return returnString;

		
		}
		
		catch (NoSuchElementException ex)
		{
			return "Invalid UserId";
		}
		
	}
}
package com.capgemini.User2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.User2.service.IUserService;

import com.capgemini.User2.entity.User;

@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
    private IUserService IUserService;
	
	
	
	//methods
	@RequestMapping(method = RequestMethod.POST,value = "/signup")
	public ResponseEntity<?> register(@RequestBody User user){
		boolean signedUp = IUserService.RegisterUser(user);
		if(signedUp){
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);

		
	}
//	@PostMapping("/AddingUser")
//	public User addingUser(@RequestBody User user)
//	{	
//			return IUserService.RegisterUser(user);
//	}
	
	@PostMapping("/login")
	public String login(@RequestBody User auth)
	{
		return IUserService.login1(auth) ;
		
	}
	
	
	
	

}

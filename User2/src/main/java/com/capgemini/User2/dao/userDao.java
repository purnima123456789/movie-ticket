package com.capgemini.User2.dao;

import java.util.Optional;

import com.capgemini.User2.entity.User;


public interface userDao {
	
	Optional<User> register(String email);

	public void saveUser(User user);

}

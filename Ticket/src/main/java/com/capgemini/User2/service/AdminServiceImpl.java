package com.capgemini.User2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.User2.entity.MovieAdmin;
import com.capgemini.User2.repository.AdminRepository;


@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	
	public MovieAdmin addTheatre(MovieAdmin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}
	
	

}

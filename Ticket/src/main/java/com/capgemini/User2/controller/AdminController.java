package com.capgemini.User2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.User2.entity.MovieAdmin;
import com.capgemini.User2.service.IAdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
    private IAdminService IAdminService;
	
	
	@PostMapping("/AddingTheatre")
	public MovieAdmin addingTheatre(@RequestBody MovieAdmin admin)
	{	
			return IAdminService.addTheatre(admin);
    }
	
	
	
	

}

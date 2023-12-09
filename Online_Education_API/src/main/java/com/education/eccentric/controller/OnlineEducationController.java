package com.education.eccentric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.eccentric.entity.OnlineEducationEntity;
import com.education.eccentric.service.OnlineEducationService;

@RestController
@RequestMapping("/api")
public class OnlineEducationController {
	
	@Autowired
	private OnlineEducationService customerService;
	
	@GetMapping("/name")
	public String name() {
		return "Welcome to Anarghya E-learning Website";
	}
	
	
	@PostMapping("/Customer")
	public OnlineEducationEntity createCustomer(@RequestBody OnlineEducationEntity customerEntity) {
		if(customerEntity!=null) {
			OnlineEducationEntity createCustomer=customerService.createCustomer(customerEntity);
			return createCustomer;
		}
		return null;
	}
}

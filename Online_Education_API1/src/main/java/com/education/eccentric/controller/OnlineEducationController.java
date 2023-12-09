package com.education.eccentric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.eccentric.entity.OnlineEducationEntity;
import com.education.eccentric.service.OnlineEducationService;

import antlr.collections.List;

@RestController
@RequestMapping("/api1")
@CrossOrigin(origins = "http://localhost:3000")
public class OnlineEducationController {
	
	@Autowired
	private OnlineEducationService contactService;
	
	@GetMapping("/name")
	public String name() {
		return "Welcome to Anarghya E-learning Website";
	}
	
	
	@PostMapping("/Contact")
	public OnlineEducationEntity createContact(@RequestBody OnlineEducationEntity contactEntity) {
		if(contactEntity!=null) {
			OnlineEducationEntity createContact=contactService.createContact(contactEntity);
			return createContact;
		}
		return null;
	}
	
	@GetMapping("/Contacts")
	public List getContacts(){
		List contacts = contactService.getContacts();
		return contacts;
	}
}
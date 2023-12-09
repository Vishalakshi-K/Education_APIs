package com.Educationcontact.Api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Educationcontact.Api.Entity.Contact;
import com.Educationcontact.Api.Repo.ContactRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

	@Autowired
	ContactRepository contactrepository;
	
	@PostMapping("/contact")
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
		return new ResponseEntity<>(contactrepository.save(contact),HttpStatus.CREATED);
	}
}

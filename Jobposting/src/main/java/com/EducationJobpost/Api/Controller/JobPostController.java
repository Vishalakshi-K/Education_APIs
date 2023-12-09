package com.EducationJobpost.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationJobpost.Api.Entity.JobPostEntity;
import com.EducationJobpost.Api.Repo.JobPostRepo;


@RestController
@CrossOrigin(origins= {"http://localhost:3000"})

@RequestMapping("/api")
public class JobPostController {
	
	@Autowired
	JobPostRepo jobpostrepositery;
	
	@PostMapping("/education")
	public ResponseEntity<JobPostEntity> savejobpost(@RequestBody JobPostEntity jobpost){
		return new ResponseEntity<>(jobpostrepositery.save(jobpost),HttpStatus.CREATED);
	}
	
}

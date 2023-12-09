package com.educationcourses.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educationcourses.Api.Entity.CoursesEntity;
import com.educationcourses.Api.Repo.CoursesRepository;

@RestController
@RequestMapping("api")
public class CoursesController {

	@Autowired
	CoursesRepository coursesrepository;
	
	@PostMapping("course")
	public ResponseEntity<CoursesEntity> saveCoursesEntity(@RequestBody CoursesEntity courses){
		return new ResponseEntity<>(coursesrepository.save(courses),HttpStatus.CREATED);
	}
	
}

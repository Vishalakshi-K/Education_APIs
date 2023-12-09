package com.educationcoursesvideos.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educationcoursesvideos.Api.Entity.CoursesVideosEntity;
import com.educationcoursesvideos.Api.Repo.CoursesVideosRepository;

@RestController
@RequestMapping("api")
public class CoursesVideosController {

	@Autowired
	CoursesVideosRepository coursesvideosrepository;
	
	@PostMapping("videos")
	public ResponseEntity<CoursesVideosEntity> saveCoursesVideosEntity(@RequestBody CoursesVideosEntity videos){
		return new ResponseEntity<>(coursesvideosrepository.save(videos),HttpStatus.CREATED);
	}

}

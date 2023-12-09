package com.EducationQuery.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationQuery.Api.Entity.QueryEntity;
import com.EducationQuery.Api.Repo.QueryRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/api")
public class QueryController {

	@Autowired
	QueryRepository queryrepository;
	
	@PostMapping("/query")
	public ResponseEntity<QueryEntity> saveQueryEntity(@RequestBody QueryEntity queryentity){
		return new ResponseEntity<>(queryrepository.save(queryentity),HttpStatus.CREATED);
	}

}

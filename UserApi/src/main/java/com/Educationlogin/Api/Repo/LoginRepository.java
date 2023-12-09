package com.Educationlogin.Api.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Educationlogin.Api.Entity.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {


	public Optional<Login> findByEmailAndPassword(String email, String password);
	
	 

}
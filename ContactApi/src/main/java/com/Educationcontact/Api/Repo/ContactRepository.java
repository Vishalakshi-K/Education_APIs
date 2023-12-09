package com.Educationcontact.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Educationcontact.Api.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long >  {

}

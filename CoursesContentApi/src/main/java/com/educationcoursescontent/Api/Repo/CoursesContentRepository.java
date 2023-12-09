package com.educationcoursescontent.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationcoursescontent.Api.Entity.CoursesContentEntity;

@Repository
public interface CoursesContentRepository extends JpaRepository<CoursesContentEntity, Long> {

}

package com.educationcourses.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationcourses.Api.Entity.CoursesEntity;

@Repository
public interface CoursesRepository extends JpaRepository <CoursesEntity, Long> {

}

package com.educationcoursesvideos.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationcoursesvideos.Api.Entity.CoursesVideosEntity;

@Repository
public interface CoursesVideosRepository extends JpaRepository <CoursesVideosEntity, Long>{

}

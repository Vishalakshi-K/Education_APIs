package com.EducationJobpost.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationJobpost.Api.Entity.JobPostEntity;


@Repository
public interface JobPostRepo extends JpaRepository<JobPostEntity,Long> {

}

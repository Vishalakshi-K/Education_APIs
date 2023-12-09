package com.EducationQuery.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationQuery.Api.Entity.QueryEntity;

public interface QueryRepository extends JpaRepository<QueryEntity, Long>{

}

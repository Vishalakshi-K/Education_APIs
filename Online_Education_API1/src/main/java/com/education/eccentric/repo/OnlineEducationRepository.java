package com.education.eccentric.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.eccentric.entity.OnlineEducationEntity;

@Repository
public interface OnlineEducationRepository extends JpaRepository <OnlineEducationEntity, Long> {

}

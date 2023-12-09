package com.education.eccentric.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.eccentric.entity.OnlineEducationEntity;
import com.education.eccentric.repo.OnlineEducationRepository;

@Service
public class OnlineEducationServiceImpI implements OnlineEducationService {

	@Autowired
	private OnlineEducationRepository customerRepo;
	
	@Override
	public OnlineEducationEntity createCustomer (OnlineEducationEntity customerEntity) {
		if(customerEntity!=null) {
			OnlineEducationEntity customer = customerRepo.save(customerEntity);
		}
		else {
			return null;
		}
		return customerEntity;
	}

}

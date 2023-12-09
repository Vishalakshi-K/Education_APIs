package com.education.eccentric.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.eccentric.entity.OnlineEducationEntity;
import com.education.eccentric.repo.OnlineEducationRepository;

@Service
public abstract class OnlineEducationServiceImpI implements OnlineEducationService {

	@Autowired
	private OnlineEducationRepository contactRepo;
	
	@Override
	public OnlineEducationEntity createContact (OnlineEducationEntity contactEntity) {
		if(contactEntity!=null) {
			OnlineEducationEntity contact = contactRepo.save(contactEntity);
		}
		else {
			return null;
		}
		return contactEntity;
	}

}

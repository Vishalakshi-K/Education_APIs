package com.education.eccentric.service;

import com.education.eccentric.entity.OnlineEducationEntity;

import antlr.collections.List;

public interface OnlineEducationService {
	public OnlineEducationEntity createContact (OnlineEducationEntity contactEntity);

	public List getContacts();

}

package com.Educationlogin.Api.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Educationlogin.Api.Entity.Login;
import com.Educationlogin.Api.Entity.Loginform;
import com.Educationlogin.Api.Repo.LoginRepository;

@Service
public class EducationSerciveimpl implements EducationService {

	@Autowired
	private LoginRepository customerRepo;

	@Override
	public boolean loginVerify(Loginform form) {

		Optional<Login> byEmailAndPassword = customerRepo.findByEmailAndPassword(form.getemail(), form.getpassword());
		if (byEmailAndPassword.isEmpty()) {
			return false;
		}
		return true;

//			ResourceHandlerRegistration entity = (ResourceHandlerRegistration) form.findByEmailAndPassword(form.getemail1(), form.getpassword());
//
//			if (entity == null) {
//				return false;
//			}
//			return false;

		// create session and store user data in session

	}
}

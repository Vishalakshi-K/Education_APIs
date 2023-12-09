package com.EducationJobpost.Api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class JobPostEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private long Id;
	private String CompanyName;
	private String Role;
	private long ExperienceRequired;
	private String SkillsRequired;
	private String REsponsibilities;
	private String ContactEmail;
	private long Contactnumber;
	private String YourName;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public long getExperienceRequired() {
		return ExperienceRequired;
	}
	public void setExperienceRequired(long experienceRequired) {
		ExperienceRequired = experienceRequired;
	}
	public String getSkillsRequired() {
		return SkillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		SkillsRequired = skillsRequired;
	}
	public String getREsponsibilities() {
		return REsponsibilities;
	}
	public void setREsponsibilities(String rEsponsibilities) {
		REsponsibilities = rEsponsibilities;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public long getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		Contactnumber = contactnumber;
	}
	public String getYourName() {
		return YourName;
	}
	public void setYourName(String yourName) {
		YourName = yourName;
	}
	public JobPostEntity(long id, String companyName, String role, long experienceRequired, String skillsRequired,
			String rEsponsibilities, String contactEmail, long contactnumber, String yourName) {
		super();
		Id = id;
		CompanyName = companyName;
		Role = role;
		ExperienceRequired = experienceRequired;
		SkillsRequired = skillsRequired;
		REsponsibilities = rEsponsibilities;
		ContactEmail = contactEmail;
		Contactnumber = contactnumber;
		YourName = yourName;
	}
	public JobPostEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JobpostEntity [Id=" + Id + ", CompanyName=" + CompanyName + ", Role=" + Role + ", ExperienceRequired="
				+ ExperienceRequired + ", SkillsRequired=" + SkillsRequired + ", REsponsibilities=" + REsponsibilities
				+ ", ContactEmail=" + ContactEmail + ", Contactnumber=" + Contactnumber + ", YourName=" + YourName
				+ "]";
	}


}

package com.educationcourses.Api.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoursesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseid;
	private String domainname;
	private LocalDate createddate;
	private LocalDate updateddate;
	private long coursecontent;
	public long getCourseid() {
		return courseid;
	}
	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}
	public String getDomainname() {
		return domainname;
	}
	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}
	public LocalDate getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}
	public LocalDate getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}
	public long getCoursecontent() {
		return coursecontent;
	}
	public void setCoursecontent(long coursecontent) {
		this.coursecontent = coursecontent;
	}
	public CoursesEntity(long courseid, String domainname, LocalDate createddate, LocalDate updateddate,
			long coursecontent) {
		super();
		this.courseid = courseid;
		this.domainname = domainname;
		this.createddate = createddate;
		this.updateddate = updateddate;
		this.coursecontent = coursecontent;
	}
	public CoursesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CoursesEntity [courseid=" + courseid + ", domainname=" + domainname + ", createddate=" + createddate
				+ ", updateddate=" + updateddate + ", coursecontent=" + coursecontent + "]";
	}

}

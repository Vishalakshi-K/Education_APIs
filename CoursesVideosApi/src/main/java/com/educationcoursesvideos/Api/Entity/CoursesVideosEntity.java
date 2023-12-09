package com.educationcoursesvideos.Api.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@JsonFormat(pattern="MM/dd/yyyy")
public class CoursesVideosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long videoid;
	public String videodescription;
	public String videourl;
	public LocalDate createdDate;
	public LocalDate updateddate;
	public long courseid;
	public long getVideoid() {
		return videoid;
	}
	public void setVideoid(long videoid) {
		this.videoid = videoid;
	}
	public String getVideodescription() {
		return videodescription;
	}
	public void setVideodescription(String videodescription) {
		this.videodescription = videodescription;
	}
	public String getVideourl() {
		return videourl;
	}
	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreateddate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}
	public long getCourseid() {
		return courseid;
	}
	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}
	public CoursesVideosEntity(long videoid, String videodescription, String videourl, LocalDate createddate,
			LocalDate updateddate, long courseid) {
		super();
		this.videoid = videoid;
		this.videodescription = videodescription;
		this.videourl = videourl;
		this.createdDate = createdDate;
		this.updateddate = updateddate;
		this.courseid = courseid;
	}
	public CoursesVideosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CoursesVideosEntity [videoid=" + videoid + ", videodescription=" + videodescription + ", videourl="
				+ videourl + ", createddate=" + createdDate + ", updateddate=" + updateddate + ", courseid=" + courseid
				+ "]";
	}
}

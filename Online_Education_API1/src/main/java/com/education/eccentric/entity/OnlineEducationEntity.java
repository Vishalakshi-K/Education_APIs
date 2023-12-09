package com.education.eccentric.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Education_Contact")
public class OnlineEducationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String email;
	private String comment;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public OnlineEducationEntity(Long userId, String name, String email, String comment) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.comment = comment;
	}
	public OnlineEducationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OnlineEducationEntity [userId=" + userId + ", name=" + name + ", email=" + email + ", comment="
				+ comment + "]";
	}
	
	
}

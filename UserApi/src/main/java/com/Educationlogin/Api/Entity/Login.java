package com.Educationlogin.Api.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long Id;
	private String firstname;
	private String lastname;
	private long mobilenumber;
	private String email;
	private String address;
	private String password;
	private String role;
	private String accountstatus;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}
	public Login(long id, String firstname, String lastname, long mobilenumber, String email, String address,
			String password, String role, String accountstatus) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.address = address;
		this.password = password;
		this.role = role;
		this.accountstatus = accountstatus;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + ", email=" + email + ", address=" + address + ", password=" + password + ", role="
				+ role + ", accountstatus=" + accountstatus + "]";
	}
	
}
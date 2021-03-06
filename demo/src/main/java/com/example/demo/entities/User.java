package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_login")
//Bean class for Login
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int loginid;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@Column
	String email;
	
	@Column
	String role;
	
	@JsonIgnoreProperties("user")
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    Customer customer;
	
	@JsonIgnoreProperties("user")
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    Retailer retailer;
	
	@JsonIgnoreProperties("user")
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	GovernmentAuthority ga;
	
	@JsonIgnoreProperties("user")
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	Set<AdminStock> stocks;
	
	public User() 
	{
		super();
	}

	public User(String username, String password, String email, String role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	//	this.customer = customer;
	}

	public User(int loginid, String username, String password, String email, String role) {
		super();
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	//	this.customer = customer;
	}

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	/*
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	*/
}

package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_govauthority")
public class GovernmentAuthority 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int gaid;
	
	@Column
	String centrename;
	
	@Column
	String contactno;
	
	@Column
	String address;
	
	@Column
	int pincode;
	
	@Column
	int status;

	@JsonIgnoreProperties("ga")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loginid")
	User user;

	public GovernmentAuthority() {
		super();
	}

	public GovernmentAuthority(int gaid, String centrename, String contactno, String address, int pincode, int status,
			User user) {
		super();
		this.gaid = gaid;
		this.centrename = centrename;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
		this.status = status;
		this.user = user;
	}

	public GovernmentAuthority(String centrename, String contactno, String address, int pincode, int status,
			User user) {
		super();
		this.centrename = centrename;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
		this.status = status;
		this.user = user;
	}

	public int getGaid() {
		return gaid;
	}

	public void setGaid(int gaid) {
		this.gaid = gaid;
	}

	public String getCentrename() {
		return centrename;
	}

	public void setCentrename(String centrename) {
		this.centrename = centrename;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

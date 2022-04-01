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
@Table(name="tbl_retailers")
public class Retailer
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rid;
	
	@Column
	String rname;
	
	@Column
	int regno;
	
	@Column
	String contactno;
	
	@Column
	String address;
	
	@Column
	int pincode;
	
	@Column
	String gender;
	
	@Column
	int status;

	@JsonIgnoreProperties("retailer")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loginid")
	User user;
	
	public Retailer()
	{
		super();
	}
	
	public Retailer(int rid, String rname, int regno, String contactno, String address, int pincode, String gender,
			int status, User user)
	{
		super();
		this.rid = rid;
		this.rname = rname;
		this.regno = regno;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.status = status;
		this.user = user;
	}

	public Retailer(String rname, int regno, String contactno, String address, int pincode, String gender, int status,
			User user) 
	{
		super();
		this.rname = rname;
		this.regno = regno;
		this.contactno = "122323";
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.status = status;
		this.user = user;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

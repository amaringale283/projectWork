package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_customers")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	
	@Column
	String cname;
	
	@Column
	String contactno;
	
	@Column
	String address;
	
	@Column
	int pincode;
	
	@Column
	String gender;
	
	@Column
	String aadharno;
	
	@Column
	int familymembers;

	@JsonIgnoreProperties("customer")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loginid")
	User user;
	
	@JsonIgnoreProperties("customer")
	@OneToMany(mappedBy ="customer",cascade = CascadeType.ALL )
	List<Order> order;
	
	@JsonIgnoreProperties("customer")
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	Set<CustomerStock> items;
	
	public Customer() 
	{
		super();
	}
	
	public Customer(int cid, String cname, String contactno, String address, int pincode, String gender,
			String aadharno, int familymembers, User user) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.aadharno = aadharno;
		this.familymembers = familymembers;
	//	this.loginid = loginid;
		this.user = user;
	}

	public Customer(int cid) {
		super();
		this.cid = cid;
	}

	public Customer(String cname, String contactno, String address, int pincode, String gender, String aadharno,
			int familymembers, User user) 
	{
		super();
		this.cname = cname;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.aadharno = aadharno;
		this.familymembers = familymembers;
	//	this.loginid = loginid;
		this.user = user;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public int getFamilymembers() {
		return familymembers;
	}

	public void setFamilymembers(int familymembers) {
		this.familymembers = familymembers;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", contactno=" + contactno + ", address=" + address
				+ ", pincode=" + pincode + ", gender=" + gender + ", aadharno=" + aadharno + ", familymembers="
				+ familymembers + ", user=" + user + "]";
	}
	
	
}

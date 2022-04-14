package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_adminstock")
public class AdminStock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int asid;
	
	@JsonIgnoreProperties("stocks")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loginid")
	User user;
	
	@JsonIgnoreProperties("adminstock")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productid")
	Product product;
	
	@Column
	double totalqty;
	
	@Column
	double availableqty;
	
	@Column
	String month;
	
	@Column
	int year;

	public AdminStock() {
		super();
	}

	public AdminStock(int asid, Product product, double totalqty, double availableqty, String month, int year) {
		super();
		this.asid = asid;
		this.product = product;
		this.totalqty = totalqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public AdminStock(Product product, double totalqty, double availableqty, String month, int year) {
		super();
		this.product = product;
		this.totalqty = totalqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public int getAsid() {
		return asid;
	}

	public void setAsid(int asid) {
		this.asid = asid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getTotalqty() {
		return totalqty;
	}

	public void setTotalqty(double totalqty) {
		this.totalqty = totalqty;
	}

	public double getAvailableqty() {
		return availableqty;
	}

	public void setAvailableqty(double availableqty) {
		this.availableqty = availableqty;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

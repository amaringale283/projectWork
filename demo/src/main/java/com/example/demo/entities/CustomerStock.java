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
@Table(name="tbl_customerstock")
public class CustomerStock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int csid;
	
	@JsonIgnoreProperties("items")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid")
	Customer customer;
	
	@JsonIgnoreProperties("customerstock")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productid")
	Product product;
	
	@Column
	double allocatedqty;
	
	@Column
	double availableqty;
	
	@Column
	String month;
	
	@Column
	int year;

	public CustomerStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerStock(int csid, Customer customer, Product product, double allocatedqty, double availableqty,
			String month, int year) {
		super();
		this.csid = csid;
		this.product = product;
		this.allocatedqty = allocatedqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public CustomerStock(Customer customer, Product product, double allocatedqty, double availableqty, String month,
			int year) {
		super();
		this.product = product;
		this.allocatedqty = allocatedqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public int getCsid() {
		return csid;
	}

	public void setCsid(int csid) {
		this.csid = csid;
	}

	public double getAllocatedqty() {
		return allocatedqty;
	}

	public void setAllocatedqty(double allocatedqty) {
		this.allocatedqty = allocatedqty;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}

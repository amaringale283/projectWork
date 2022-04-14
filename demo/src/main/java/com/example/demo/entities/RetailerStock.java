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
@Table(name="tbl_retailerstock")
public class RetailerStock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rsid;
	
	@JsonIgnoreProperties("items")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailerid")
	Retailer retailer;
	
	@JsonIgnoreProperties("retailerstock")
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

	public RetailerStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RetailerStock(int rsid, Product product, double allocatedqty, double availableqty, String month, int year) {
		super();
		this.rsid = rsid;
		this.product = product;
		this.allocatedqty = allocatedqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public RetailerStock(Product product, double allocatedqty, double availableqty, String month, int year) {
		super();
		this.product = product;
		this.allocatedqty = allocatedqty;
		this.availableqty = availableqty;
		this.month = month;
		this.year = year;
	}

	public int getRsid() {
		return rsid;
	}

	public void setRsid(int rsid) {
		this.rsid = rsid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
	
}

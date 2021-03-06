package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_products")
public class Product
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	
	@Column
	String pname;
	
	@Column
	float rate;
	
	@JsonIgnoreProperties("product")
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<CustomerStock> customerstock;
	
	@JsonIgnoreProperties("product")
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<RetailerStock> retailerstock;

	@JsonIgnoreProperties("product")
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<AdminStock> adminstock;
	
	@JsonIgnoreProperties("product")
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	Set<Orderitem> orderitem;
	
	public Product() {
		super();
	}

	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public Product(int pid, String pname, float rate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.rate = rate;
	}

	public Product(String pname, float rate) {
		super();
		this.pname = pname;
		this.rate = rate;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
/*
	public Set<Orderitem> getOrderitem() {
		return orderitem;
	}
*/
	public void setOrderitem(Set<Orderitem> orderitem) {
		this.orderitem = orderitem;
		for(Orderitem q : orderitem)
			q.setProduct(this);
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", rate=" + rate + "]";
	}
	
	
}

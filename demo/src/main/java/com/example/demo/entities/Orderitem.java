package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_orderitems")
public class Orderitem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oiid;
	
	@Column
	int quantity;
	
	@Column
	double amount;
	
	@JsonIgnoreProperties("orderitems")
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="productid")
	Product product;
	
	@JsonIgnoreProperties("items")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="orderid")
	Order order;
	
	public Orderitem() {
		super();
	}
	
	public Orderitem(int oiid) {
		super();
		this.oiid = oiid;
	}

	public Orderitem(int quantity, double amount, Product product, Order order) {
		super();
		this.quantity = quantity;
		this.amount = amount;
		this.product = product;
		this.order = order;
	}

	public Orderitem(int oiid, int quantity, double amount, Product product, Order order) {
		super();
		this.oiid = oiid;
		this.quantity = quantity;
		this.amount = amount;
		this.product = product;
		this.order = order;
	}

	public int getOiid() {
		return oiid;
	}

	public void setOiid(int oiid) {
		this.oiid = oiid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Orderitem [quantity=" + quantity + ", amount=" + amount + ", product=" + product + "]";
	}	
	
}

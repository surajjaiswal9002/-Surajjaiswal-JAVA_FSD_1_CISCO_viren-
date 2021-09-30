package com.api.sportyShoes_p3.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name ="purchase" ) 

public class Purchase 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "purchase_id")
	private int purchase_id;
	
	@Column(name ="purchase_name")
	private String username;
	
	@Column(name ="email")
	private String email;
	
	@Column(name = "brand")
	private String brand;

	@Column(name = "price")
	private int price;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "size")
	private int  size;
	
	
	@Column(name = "date")
	private Date date;
	
	
	public int getPurchase_id() {
		return purchase_id;
	}


	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}


	public String getPurchase_name() {
		return username;
	}


	public void setPurchase_name(String purchase_name) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	
	
	


	
}
	
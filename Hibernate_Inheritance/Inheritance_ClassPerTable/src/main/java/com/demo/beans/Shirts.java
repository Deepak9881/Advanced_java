package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Shirts1")
public class Shirts extends Clothes{
	
	private String brand1;
	private String color1;
	
	public Shirts() {
		super();
	}

	public Shirts(int cid, double price,String brand, String color) {
		super(cid,price);
		this.brand1 = brand;
		this.color1 = color;
	}

	public String getBrand() {
		return brand1;
	}

	public void setBrand(String brand) {
		this.brand1 = brand;
	}

	public String getColor() {
		return color1;
	}

	public void setColor(String color) {
		this.color1 = color;
	}

	@Override
	public String toString() {
		return super.toString()+"Shirts [brand=" + brand1 + ", color=" + color1 + "]";
	}
	
	
	

}

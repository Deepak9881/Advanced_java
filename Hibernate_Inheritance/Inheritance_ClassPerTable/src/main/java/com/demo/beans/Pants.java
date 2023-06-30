package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="Pants1")
public class Pants extends Clothes{
	private String brand;
	private String color;
	
	public Pants() {
		super();
	}

	public Pants(int cid, double price,String brand, String color) {
		super(cid,price);
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+"Pants [brand=" + brand + ", color=" + color + "]";
	}
	
	
	

}

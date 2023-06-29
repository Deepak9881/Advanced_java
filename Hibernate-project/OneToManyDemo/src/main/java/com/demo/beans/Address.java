package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	private int addrid;
	private String street,city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private MyUser mu;

	public Address() {
		super();
	}

	public Address(int addrid, String street, String city, MyUser mu) {
		super();
		this.addrid = addrid;
		this.street = street;
		this.city = city;
		this.mu = mu;
	}

	public int getAddrid() {
		return addrid;
	}

	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public MyUser getMu() {
		return mu;
	}

	public void setMu(MyUser mu) {
		this.mu = mu;
	}

	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", street=" + street + ", city=" + city +  "]";
	}
	

}

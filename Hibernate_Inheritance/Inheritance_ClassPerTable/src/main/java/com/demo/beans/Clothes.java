package com.demo.beans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Clothes1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Clothes {
@Id
private int cid;
private double price;

public Clothes() {
	super();
}

public Clothes(int cid, double price) {
	super();
	this.cid = cid;
	this.price = price;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Clothes [cid=" + cid + ", price=" + price + "]";
}



}

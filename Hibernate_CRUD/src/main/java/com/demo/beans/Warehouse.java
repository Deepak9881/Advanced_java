package com.demo.beans;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Warehouse30")
public class Warehouse {
	@Id
	private int wid;
	private String wcity;
	private String wstate;
	@OneToOne(mappedBy="w")
	private Product p;
	
	
	public Warehouse() {
		super();
	}


	public Warehouse(int wid, String wcity, String wstate, Product p) {
		super();
		this.wid = wid;
		this.wcity = wcity;
		this.wstate = wstate;
		this.p = p;
	}


	public int getWid() {
		return wid;
	}


	public void setWid(int wid) {
		this.wid = wid;
	}


	public String getWcity() {
		return wcity;
	}


	public void setWcity(String wcity) {
		this.wcity = wcity;
	}


	public String getWstate() {
		return wstate;
	}


	public void setWstate(String wstate) {
		this.wstate = wstate;
	}


	public Product getP() {
		return p;
	}


	public void setP(Product p) {
		this.p = p;
	}


	@Override
	public String toString() {
		return "Warehouse [wid=" + wid + ", wcity=" + wcity + ", wstate=" + wstate + "]";
	}
	
	
	
	
	

	
	
	

}

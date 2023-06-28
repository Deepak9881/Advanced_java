package com.demo.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Warehouse {
	
	private int wid;
	private String wname;
	private String wcity;
	private String wstate;
	
	
	public Warehouse() {
		super();
	}


	public Warehouse(int wid, String wname, String wcity, String wstate) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.wcity = wcity;
		this.wstate = wstate;
	}


	public int getWid() {
		return wid;
	}


	public void setWid(int wid) {
		this.wid = wid;
	}


	public String getWname() {
		return wname;
	}


	public void setWname(String wname) {
		this.wname = wname;
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


	@Override
	public String toString() {
		return "Warehouse [wid=" + wid + ", wname=" + wname + ", wcity=" + wcity + ", wstate=" + wstate + "]";
	}
	
	
	
	

}

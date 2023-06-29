package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="MyUSer")
public class MyUser {
	@Id
	private int uid;
	private String uname;
    @OneToMany(mappedBy="mu",fetch = FetchType.LAZY)
	private Set<Address>aset;
    
    
	public MyUser() {
		super();
	}


	public MyUser(int uid, String uname, Set<Address> aset) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.aset = aset;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public Set<Address> getAset() {
		return aset;
	}


	public void setAset(Set<Address> aset) {
		this.aset = aset;
	}


	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", aset=" + aset + "]";
	}
    
    
    
	

}

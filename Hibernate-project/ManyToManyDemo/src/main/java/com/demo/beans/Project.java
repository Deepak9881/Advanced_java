package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Project")
public class Project {
	@Id
	private int pid;
	private String pname;
	private int dur;
	@ManyToMany
	@JoinTable(name="empproj", joinColumns={@JoinColumn(name="p_pid")},
			inverseJoinColumns= {@JoinColumn(name="e_eid")})
	private Set<Employee>eset;
	
	
	public Project() {
		super();
	}


	public Project(int pid, String pname, int dur, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dur = dur;
		this.eset = eset;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getDur() {
		return dur;
	}


	public void setDur(int dur) {
		this.dur = dur;
	}


	public Set<Employee> getEset() {
		return eset;
	}


	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}


	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", dur=" + dur + ", eset=" + eset + "]";
	}
	
	
	

}

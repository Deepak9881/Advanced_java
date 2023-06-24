package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class RegisterUser {
	
	private String name;
	private String uname;
	private String address;
	private String [] skill;
	private String gender;
	private String city;
	private String ldt;
	
	public RegisterUser() {
		super();
	}

	public RegisterUser(String name, String uname, String address, String[] skill, String gender, String city,String ldt) {
		super();
		this.name = name;
		this.uname = uname;
		this.address = address;
		this.skill = skill;
		this.gender = gender;
		this.city = city;
		this.ldt=ldt;
	}

	public String getLdt() {
		return ldt;
	}

	public void setLdt(String ldt) {
		this.ldt = ldt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSkill() {
		String str="";
		for(String s:skill) {
			str+=s;
		}
		return str;
	}

	public void setSkill(String[] skill) {
		this.skill = skill;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "RegisterUser [name=" + name + ", uname=" + uname + ", address=" + address + ", skill="
				+ Arrays.toString(skill) + ", gender=" + gender + ", city=" + city + ", ldt=" + ldt + "]";
	}
	
	

}
/*Enter Name:<input type="text" name="name" id="i1"><br><br>
Enter Username:<input type="text" name="uname" id="i5"><br><br>
Enter Password:<input type="password" name="pwd" id="i2"><br><br>
Enter address:<input type="text" name="addr" id="i3"><br><br>
Select Skill:
<input type="checkbox" name="check" value="Java">
<input type="checkbox" name="check" value="C++">
<input type="checkbox" name="check" value="Python">
<input type="checkbox" name="check" value=".NET"><br><br>
Select gender: 
<input type="radio" name="gen" value="male">Male
<input type="radio" name="gen" value="female"> Female<br><br>
Select city
<select name="city">
<option value="pune">Pune</option>
<option value="mumbai">Mumbai</option>
<option value="Kolhapur"> Kolhapur</option>
<option value="Dharashiv"> Dharashiv</option>*/
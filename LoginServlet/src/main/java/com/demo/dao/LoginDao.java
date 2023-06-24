package com.demo.dao;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface LoginDao {

	MyUser getUser(MyUser myUser);

	void addRegisterUser(RegisterUser ru, MyUser mu);

}

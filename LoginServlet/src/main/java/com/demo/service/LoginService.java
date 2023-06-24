package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface LoginService {

	MyUser getUser(MyUser myUser);

	void registerUser(RegisterUser ru, MyUser mu);

}

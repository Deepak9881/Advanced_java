package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;

	public LoginServiceImpl() {
		super();
		ldao=new LoginDaoImpl();
	}

	@Override
	public MyUser getUser(MyUser myUser) {
		System.out.println("Inside Login Service");
		return ldao.getUser(myUser);
	}

	@Override
	public void registerUser(RegisterUser ru, MyUser mu) {
	      ldao.addRegisterUser(ru,mu);
	}

}

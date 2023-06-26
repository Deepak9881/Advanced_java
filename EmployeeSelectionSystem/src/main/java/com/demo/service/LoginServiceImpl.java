package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	
	private LoginDao ldao;

	public LoginServiceImpl() {
	
		this.ldao = new LoginDaoImpl();
	}

	@Override
	public MyUser getUser(MyUser myUser) {
		return ldao.getUser(myUser);
	}
	

}

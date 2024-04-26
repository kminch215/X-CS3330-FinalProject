package edu.mu.controller;

import edu.mu.model.UserInformation;
import edu.mu.view.UserLoginView;

public class UserLoginController {
	
	private UserLoginView loginView;
	private UserInformation loginModel;
	
	
	public UserLoginController(UserLoginView loginView, UserInformation loginModel) {
		super();
		this.loginView = loginView;
		this.loginModel = loginModel;
	}

	 
}
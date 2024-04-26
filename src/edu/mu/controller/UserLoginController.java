package edu.mu.controller;

import edu.mu.model.UserListModel;
import edu.mu.view.UserLoginView;

public class UserLoginController {
	
	private UserLoginView loginView;
	private UserListModel loginModel;
	
	
	public UserLoginController() {
		super();
		this.loginView = new UserLoginView();
		this.loginModel = new UserListModel();
	}

	 
}
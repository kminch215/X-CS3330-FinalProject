package edu.mu.controller;

import edu.mu.model.UserListModel;
import edu.mu.view.UserRegisterView;

public class UserRegisterController {

	private UserRegisterView registerView;
	private UserListModel registerModel;
	
	public UserRegisterController() {
		super();
		this.registerView = new UserRegisterView();
		this.registerModel = new UserListModel();
	}
	
}
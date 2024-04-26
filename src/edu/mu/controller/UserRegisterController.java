package edu.mu.controller;

import edu.mu.model.UserListModel;
import edu.mu.view.UserRegisterView;

public class UserRegisterController {

	private UserRegisterView registerView;
	private UserListModel registerModel;
	
	public UserRegisterController(UserRegisterView registerView, UserListModel registerModel) {
		super();
		this.registerView = new UserRegisterView();
		this.registerModel = new UserListModel();
	}
	
}
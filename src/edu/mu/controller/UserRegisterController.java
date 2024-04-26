package edu.mu.controller;

import edu.mu.model.UserInformation;
import edu.mu.view.UserRegisterView;

public class UserRegisterController {

	private UserRegisterView registerView;
	private UserInformation registerModel;
	
	public UserRegisterController(UserRegisterView registerView, UserInformation registerModel) {
		super();
		this.registerView = registerView;
		this.registerModel = registerModel;
	}
	
}
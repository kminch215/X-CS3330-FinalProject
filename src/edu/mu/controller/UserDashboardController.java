package edu.mu.controller;

import edu.mu.model.UserDashboard;
import edu.mu.view.UserDashboardView;

public class UserDashboardController {

	private UserDashboardView dashboardView;
	private UserDashboard dashboardModel;
	
	public UserDashboardController() {
		super();
		this.dashboardView = new UserDashboardView();
		this.dashboardModel = new UserDashboard(null); //change this to input the userID
	}
	
	
}
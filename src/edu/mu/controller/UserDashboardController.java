package edu.mu.controller;

import edu.mu.model.UserDashboard;
import edu.mu.view.UserDashboardView;

public class UserDashboardController {

	private UserDashboardView dashboardView;
	private UserDashboard dashboardModel;
	
	public UserDashboardController(UserDashboardView dashboardView, UserDashboard dashboardModel) {
		super();
		this.dashboardView = dashboardView;
		this.dashboardModel = dashboardModel;
	}
	
	
}
package edu.mu.model;

import java.util.ArrayList;

public class UserListModel {

	private ArrayList<UserInformation> userList;

	public UserListModel() {
		super();
		this.userList = new ArrayList<UserInformation>();
	}

	public ArrayList<UserInformation> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserInformation> userList) {
		this.userList = userList;
	}
	
}

package edu.mu.model;

import java.util.ArrayList;

public class UserListModel {

	private ArrayList<UserInformation> userList;

	public UserListModel(ArrayList<UserInformation> userList) {
		super();
		this.userList = userList;
	}

	public ArrayList<UserInformation> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserInformation> userList) {
		this.userList = userList;
	}
	
}

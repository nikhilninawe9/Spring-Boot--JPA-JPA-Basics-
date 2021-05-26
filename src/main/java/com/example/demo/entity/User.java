package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String userCity;
	private String userStatus;

	public User() {
		super();
	}

	public User(int userId, String userName, String userCity, String userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
		this.userStatus = userStatus;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + ", userStatus="
				+ userStatus + "]";
	}

}

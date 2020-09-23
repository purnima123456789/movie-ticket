package com.capgemini.User2.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="movieUser")
public class User {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String userId;
    private String userType;
 
    @Column(length=20)
	private String userName;
	@Column(length=20)
	private String userPassword;
	@Column(length=10)
	private long contact;
	
	private String email;
 
 
	
	public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}



public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

	

	public User() {
		
	}
	
	public User(String userId, String userType, String userName, String userPassword, long contact, String email) {
		super();
		this.userId = userId;
		this.userType= userType;
		this.userName = userName;
		this.userPassword = userPassword;
		this.contact = contact;
		this.email= email;
		
	}


	
	@Override
	public String toString() {
		return "movieUser [userId=" + userId + ", userType="+ userType +",  userName=" + userName + ", userPassword=" + userPassword + ", contact=" + contact + ", email=" + email +"]";
	}

	}



package com.flamingo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserLogin {
@OneToOne(mappedBy = "user")
private Passenger profile;
@Column(nullable = false)
private String username;
@Column(nullable = false)
private String password;

public Passenger getProfile() {
	return profile;
}
public void setProfile(Passenger profile) {
	this.profile = profile;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}

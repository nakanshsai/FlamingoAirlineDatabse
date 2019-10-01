package com.flamingo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Passenger {
@Id
	/* @OneToMany(mappedBy = "profile") */
@GeneratedValue(strategy = GenerationType.AUTO)
private int profileId;
	
@OneToOne(mappedBy = "profile") 
private UserLogin user;
public UserLogin getUser() {
	return user;
}
public void setUser(UserLogin user) {
	this.user = user;
}
private String fname;
private String mname;
	
private String lname;

private String address;

private int phoneNo;
	
private String emailId;
public int getProfileId() {
	return profileId;
}
public void setProfileId(int profileId) {
	this.profileId = profileId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "Passenger [profileId=" + profileId + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
			+ ", address=" + address + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
}




}

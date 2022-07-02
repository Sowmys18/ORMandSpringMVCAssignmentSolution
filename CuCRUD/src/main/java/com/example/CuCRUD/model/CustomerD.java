package com.example.CuCRUD.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerD {
	@Id
private int id;
private String FirstName;
private String LastName;
private String EmailId;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmailid() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
@Override
public String toString() {
	return "CustomerD [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", EmailId=" + EmailId + "]";
}
}

package com.raihan.user_service.model;

public class Contact {
private Long cId;
private String contactName;
private String email;

private Long userId;

public Contact(Long cId, String contactName, String email, Long userId) {
	super();
	this.cId = cId;
	this.contactName = contactName;
	this.email = email;
	this.userId = userId;
}

public Contact() {
	
}

public Long getcId() {
	return cId;
}

public void setcId(Long cId) {
	this.cId = cId;
}

public String getContactName() {
	return contactName;
}

public void setContactName(String contactName) {
	this.contactName = contactName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}


}

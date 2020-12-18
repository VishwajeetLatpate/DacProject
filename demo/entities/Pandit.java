package com.panditg.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pandit {
	  
	@Id
	@GeneratedValue
	private long id;
	private String DomainId;
	private String FirstName;	
	private String LastName;
	private String ContactNumber;	
	private String City;	
	private String EmailId;	
	private String Password;
	public Pandit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pandit(long id, String domainId, String firstName, String lastName, String contactNumber,
			String city, String emailId, String password) {
		super();
		
		this.id = id;
		DomainId = domainId;
		FirstName = firstName;
		LastName = lastName;
		ContactNumber = contactNumber;
		City = city;
		EmailId = emailId;
		Password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDomainId() {
		return DomainId;
	}
	public void setDomainId(String domainId) {
		DomainId = domainId;
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
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Pandit [id=" + id + ", DomainId=" + DomainId + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", ContactNumber=" + ContactNumber + ", City=" + City + ", EmailId=" + EmailId
				+ ", Password=" + Password + ", getId()=" + getId() + ", getDomainId()=" + getDomainId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getContactNumber()="
				+ getContactNumber() + ", getCity()=" + getCity() + ", getEmailId()=" + getEmailId()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

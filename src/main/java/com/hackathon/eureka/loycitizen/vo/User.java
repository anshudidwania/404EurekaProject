package com.hackathon.eureka.loycitizen.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

// This is UDAID Aadhar User
public class User {
	@JacksonXmlProperty(localName = "id", isAttribute = true)
	String id;

	@JacksonXmlProperty(localName = "fname")
	String fname;

	@JacksonXmlProperty(localName = "lname")
	String lname;

	@JacksonXmlProperty(localName = "salutation")
	String salutation;
	
	@JacksonXmlProperty(localName = "email")
	String email;
	
	@JacksonXmlProperty(localName = "city")
	String city;
	
	@JacksonXmlProperty(localName = "state")
	String state;
	
	@JacksonXmlProperty(localName = "country")
	String country;
	
	@JacksonXmlProperty(localName = "locality")
	String locality;
	
	@JacksonXmlProperty(localName = "address")
	String address;
	
	@JacksonXmlProperty(localName = "phone_no")
	String phoneNo;
	
	@JacksonXmlProperty(localName = "county_dialer_code")
	String countyDialerCode;
	
	@JacksonXmlProperty(localName = "mobile_number")
	String mobileNumber;
	
	@JacksonXmlProperty(localName = "dob")
	String dob;
	
	@JacksonXmlProperty(localName = "gender")
	String gender;
	
	@JacksonXmlProperty(localName = "creation_date")
	String creationDate;
	
	@JacksonXmlProperty(localName = "updation_date")
	String updationDate;

	@JacksonXmlProperty(localName = "password")
	String password;
	
	public User() {
	}

	/*public User(String id) {
		this.id= id;
	}*/
	public User(String id, String fname, String lname, String address) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public User(String id, String fname, String lname, String salutation, String email, String city, String state, String country, String locality, String address, String phoneNo,
			String countyDialerCode, String mobileNumber, String dob, String gender, String creationDate, String updationDate, String password) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salutation = salutation;
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
		this.locality = locality;
		this.address = address;
		this.phoneNo = phoneNo;
		this.countyDialerCode = countyDialerCode;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.gender = gender;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
		this.password = password;
	}

	public synchronized String getId() {
		return id;
	}

	public synchronized void setId(String id) {
		this.id = id;
	}

	public synchronized String getFname() {
		return fname;
	}

	public synchronized void setFname(String fname) {
		this.fname = fname;
	}

	public synchronized String getLname() {
		return lname;
	}

	public synchronized void setLname(String lname) {
		this.lname = lname;
	}

	public synchronized String getAddress() {
		return address;
	}

	public synchronized void setAddress(String address) {
		this.address = address;
	}

	public synchronized String getSalutation() {
		return salutation;
	}

	public synchronized void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public synchronized String getEmail() {
		return email;
	}

	public synchronized void setEmail(String email) {
		this.email = email;
	}

	public synchronized String getCity() {
		return city;
	}

	public synchronized void setCity(String city) {
		this.city = city;
	}

	public synchronized String getState() {
		return state;
	}

	public synchronized void setState(String state) {
		this.state = state;
	}

	public synchronized String getCountry() {
		return country;
	}

	public synchronized void setCountry(String country) {
		this.country = country;
	}

	public synchronized String getLocality() {
		return locality;
	}

	public synchronized void setLocality(String locality) {
		this.locality = locality;
	}

	public synchronized String getPhoneNo() {
		return phoneNo;
	}

	public synchronized void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public synchronized String getCountyDialerCode() {
		return countyDialerCode;
	}

	public synchronized void setCountyDialerCode(String countyDialerCode) {
		this.countyDialerCode = countyDialerCode;
	}

	public synchronized String getMobileNumber() {
		return mobileNumber;
	}

	public synchronized void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public synchronized String getDob() {
		return dob;
	}

	public synchronized void setDob(String dob) {
		this.dob = dob;
	}

	public synchronized String getGender() {
		return gender;
	}

	public synchronized void setGender(String gender) {
		this.gender = gender;
	}

	public synchronized String getCreationDate() {
		return creationDate;
	}

	public synchronized void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public synchronized String getUpdationDate() {
		return updationDate;
	}

	public synchronized void setUpdationDate(String updationDate) {
		this.updationDate = updationDate;
	}

	public synchronized String getPassword() {
		return password;
	}

	public synchronized void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salutation=" + salutation + ", email=" + email + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", locality=" + locality + ", address=" + address + ", phoneNo=" + phoneNo + ", countyDialerCode=" + countyDialerCode + ", mobileNumber=" + mobileNumber + ", dob=" + dob
				+ ", gender=" + gender + ", creationDate=" + creationDate + ", updationDate=" + updationDate + ", password=" + password + "]";
	}

	

}

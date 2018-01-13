package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class LoyCitizenUserVO {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("memberId")
	private Long memberId;
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("mname")
	private String mname;

	@JsonProperty("lname")
	private String lname;

	@JsonProperty("salutation")
	private String salutation;
	
	@JsonProperty("email")
	private String email;

	@JsonProperty("city")
	private String city;

	@JsonProperty("province")
	private String province;
	
	@JsonProperty("locality")
	private String locality;
	
	@JsonProperty("countryCode")
	private Long countryCode;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("phoneNo")
	private String phoneNo;
	
	@JsonProperty("countyDialerCode")
	private Long countyDialerCode;
	
	@JsonProperty("postalCode")
	private Long postalCode;
	
	@JsonProperty("mobileNumber")
	private String mobileNumber;
	
	@JsonProperty("dob")
	private String dob;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("isValidated")
	private String isValidated;
	
	@JsonProperty("creationDate")
	private String creationDate;
	
	@JsonProperty("updationDate")
	private String updationDate;

	@JsonProperty("password")
	private String password;

	public synchronized String getId() {
		return id;
	}

	public synchronized void setId(String id) {
		this.id = id;
	}

	public synchronized Long getMemberId() {
		return memberId;
	}

	public synchronized void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public synchronized String getFname() {
		return fname;
	}

	public synchronized void setFname(String fname) {
		this.fname = fname;
	}

	public synchronized String getMname() {
		return mname;
	}

	public synchronized void setMname(String mname) {
		this.mname = mname;
	}

	public synchronized String getLname() {
		return lname;
	}

	public synchronized void setLname(String lname) {
		this.lname = lname;
	}

	public synchronized String getSalutation() {
		return salutation;
	}

	public synchronized void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	
	public synchronized Long getPostalCode() {
		return postalCode;
	}

	public synchronized void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
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

	public synchronized String getProvince() {
		return province;
	}

	public synchronized void setProvince(String province) {
		this.province = province;
	}

	public synchronized String getLocality() {
		return locality;
	}

	public synchronized void setLocality(String locality) {
		this.locality = locality;
	}

	public synchronized Long getCountryCode() {
		return countryCode;
	}

	public synchronized void setCountryCode(Long countryCode) {
		this.countryCode = countryCode;
	}

	public synchronized String getAddress() {
		return address;
	}

	public synchronized void setAddress(String address) {
		this.address = address;
	}

	public synchronized String getPhoneNo() {
		return phoneNo;
	}

	public synchronized void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public synchronized Long getCountyDialerCode() {
		return countyDialerCode;
	}

	public synchronized void setCountyDialerCode(Long countyDialerCode) {
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

	public synchronized String getIsValidated() {
		return isValidated;
	}

	public synchronized void setIsValidated(String isValidated) {
		this.isValidated = isValidated;
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
}

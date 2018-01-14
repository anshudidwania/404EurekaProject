package com.hackathon.eureka.loycitizen.loycitizenuser.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hackathon.eureka.loycitizen.util.EurekaUtil;
import com.hackathon.eureka.loycitizen.vo.LoyCitizenUserVO;

//LoyCitizen LoyCitizenUser
@Entity
@Table(name = "EUREKA_USER_MST")
public class LoyCitizenUser {
	
	@Id
	@Column(name = "uidai_code", unique = true, nullable = false)
	String id;

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "member_id", nullable = false)
	Long memberId;
	
	@Column(name = "fname",length = 20)
	private String fname;
	
	@Column(name = "mname",length = 20)
	private String mname;

	@Column(name = "lname",length = 20)
	private String lname;

	@Column(name = "salutation",length = 20)
	private String salutation;
	
	@Column(name = "email",length = 20)
	private String email;

	@Column(name = "city",length = 20)
	private String city;

	@Column(name = "province",length = 20)
	private String province;
	
	@Column(name = "locality",length = 20)
	private String locality;
	
	@Column(name = "country_code")
	private Long countryCode;
	
	@Column(name = "address",length = 20)
	private String address;
	
	@Column(name = "phone_no",length = 20)
	private String phoneNo;
	
	@Column(name = "COUNTY_DIALER_CODE")
	private Long countyDialerCode;
	
	@Column(name = "POSTAL_CODE")
	private Long postalCode;
	
	@Column(name = "MOBILE_NUMBER",length = 20)
	private String mobileNumber;
	
	@Column(name = "dob",length = 20)
	private Date dob;
	
	@Column(name = "gender",length = 20)
	private String gender;
	
	@Column(name = "is_validated",length = 20)
	private String isValidated;
	
	@Column(name = "CREATED_DATE")
	private Date creationDate;
	
	@Column(name = "UPDATION_DATE")
	private Date updationDate;

	@Column(name = "password",length = 20)
	private String password;

	
	public LoyCitizenUser() {
	}

	public LoyCitizenUser(LoyCitizenUserVO vo){
		this.id = vo.getId();
		this.memberId = vo.getMemberId();
		this.countryCode = vo.getCountryCode();
		this.fname = vo.getFname();
		this.mname = vo.getMname();
		this.lname = vo.getLname();
		this.salutation = vo.getSalutation();
		this.email = vo.getEmail();
		this.city = vo.getCity();
		this.province = vo.getProvince();
		this.locality = vo.getLocality();
		this.address = vo.getAddress();
		this.postalCode =vo.getPostalCode();
		this.phoneNo = vo.getPhoneNo();
		this.countyDialerCode = vo.getCountyDialerCode();
		this.mobileNumber = vo.getMobileNumber();
		this.dob = EurekaUtil.convertStringToDate(vo.getDob());
		this.gender = vo.getGender();
		this.isValidated = vo.getIsValidated();
		this.creationDate = EurekaUtil.convertStringToDate(vo.getCreationDate());
		this.updationDate = EurekaUtil.convertStringToDate(vo.getUpdationDate());
		this.password = vo.getPassword();
	}
	
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

	public synchronized Date getDob() {
		return dob;
	}

	public synchronized void setDob(Date dob) {
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

	public synchronized Date getCreationDate() {
		return creationDate;
	}

	public synchronized void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public synchronized Date getUpdationDate() {
		return updationDate;
	}

	public synchronized void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}

	public synchronized String getPassword() {
		return password;
	}

	public synchronized void setPassword(String password) {
		this.password = password;
	}
	
	
}

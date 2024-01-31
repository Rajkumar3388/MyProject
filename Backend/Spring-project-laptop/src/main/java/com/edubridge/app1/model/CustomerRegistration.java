package com.edubridge.app1.model;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="customerRegistration_details")

public class CustomerRegistration {
	@Id
	@GeneratedValue
	private Integer customerId;
	private String userName;
	private String userEmail;
	private String gender;
	private String userPassword;
	private long mobileNumber;
	/**
	 * 
	 */
	public CustomerRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [customerId=" + customerId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", gender=" + gender + ", userPassword=" + userPassword + ", mobileNumber=" + mobileNumber + "]";
	}
	/**
	 * @param customerId
	 * @param userName
	 * @param userEmail
	 * @param gender
	 * @param userPassword
	 * @param mobileNumber
	 */
	public CustomerRegistration(Integer customerId, String userName, String userEmail, String gender,
			String userPassword, long mobileNumber) {
		super();
		this.customerId = customerId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.gender = gender;
		this.userPassword = userPassword;
		this.mobileNumber = mobileNumber;
	}
	
	

}

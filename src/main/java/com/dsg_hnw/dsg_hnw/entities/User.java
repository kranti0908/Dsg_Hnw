package com.dsg_hnw.dsg_hnw.entities;

import java.util.Date;

@Entity

public class User {

	
	 private long id;
	 private double amount;
	 private String country;
	 private Date dateCreated;
	 private String emailId;
	 private String firstName;
	 private String goodTimeToConnect;
	 private String invitationCode;
	 private String lastName;
	 private Date lastUpdated;
	 private String memberSponsor;
	 private long mobileNo;
	 private String modeOfConnect;
	 private long postalCode;
	 private String remark;
	 private String sizeOfBar;
	 private String status;
	 
	@Override
	public String toString() {
		return "user [id=" + id + ", amount=" + amount + ", country=" + country + ", dateCreated=" + dateCreated
				+ ", emailId=" + emailId + ", firstName=" + firstName + ", goodTimeToConnect=" + goodTimeToConnect
				+ ", invitationCode=" + invitationCode + ", lastName=" + lastName + ", lastUpdated=" + lastUpdated
				+ ", memberSponsor=" + memberSponsor + ", mobileNo=" + mobileNo + ", modeOfConnect=" + modeOfConnect
				+ ", postalCode=" + postalCode + ", remark=" + remark + ", sizeOfBar=" + sizeOfBar + ", status="
				+ status + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGoodTimeToConnect() {
		return goodTimeToConnect;
	}

	public void setGoodTimeToConnect(String goodTimeToConnect) {
		this.goodTimeToConnect = goodTimeToConnect;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getMemberSponsor() {
		return memberSponsor;
	}

	public void setMemberSponsor(String memberSponsor) {
		this.memberSponsor = memberSponsor;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getModeOfConnect() {
		return modeOfConnect;
	}

	public void setModeOfConnect(String modeOfConnect) {
		this.modeOfConnect = modeOfConnect;
	}

	public long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSizeOfBar() {
		return sizeOfBar;
	}

	public void setSizeOfBar(String sizeOfBar) {
		this.sizeOfBar = sizeOfBar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, double amount, String country, Date dateCreated, String emailId, String firstName,
			String goodTimeToConnect, String invitationCode, String lastName, Date lastUpdated, String memberSponsor,
			long mobileNo, String modeOfConnect, long postalCode, String remark, String sizeOfBar, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.country = country;
		this.dateCreated = dateCreated;
		this.emailId = emailId;
		this.firstName = firstName;
		this.goodTimeToConnect = goodTimeToConnect;
		this.invitationCode = invitationCode;
		this.lastName = lastName;
		this.lastUpdated = lastUpdated;
		this.memberSponsor = memberSponsor;
		this.mobileNo = mobileNo;
		this.modeOfConnect = modeOfConnect;
		this.postalCode = postalCode;
		this.remark = remark;
		this.sizeOfBar = sizeOfBar;
		this.status = status;
	}
}

package com.kafka.bean;
public class Student {
	

	private long id;
	

	public Student(long id, String firstName, String lastName, String emailId, String address, String city,
			String state, long zipcode, String telephone, String date, String likeMOst, String interest,
			String recommend) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.telephone = telephone;
		this.date = date;
		this.likeMOst = likeMOst;
		this.interest = interest;
		this.recommend = recommend;
	}
	private String firstName;
	
	
	private String lastName;
	
	
	private String emailId;
	
	
	private String address;
	
	
	private String city;
	
	
	private String state;
	
	
	private long zipcode;
	
	
	private String telephone;
	
	
	private String date;
	
	
	private String likeMOst;
	
	
	private String interest;
	
	
	private String recommend;
	
	public Student() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLikeMOst() { 
		return likeMOst;
	}
	public void setLikeMOst(String likeMOst) {
		this.likeMOst = likeMOst;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	

}

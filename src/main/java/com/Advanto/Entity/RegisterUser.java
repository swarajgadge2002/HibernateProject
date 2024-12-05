package com.Advanto.Entity;

import java.util.Date;

import javax.persistence.Entity;

//import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class RegisterUser {
	@Id
	int aadharno;
	String name;
	int age;
	String boardingpoint;
	String DestinationPoint;
	@Temporal(value=TemporalType.DATE)
	Date dateofdeparture;
	boolean payment;
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDestinationPoint() {
		return DestinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		DestinationPoint = destinationPoint;
	}
	public Date getDateofdeparture() {
		return dateofdeparture;
	}
	public void setDateofdeparture(Date dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "RegisterUser [aadharno=" + aadharno + ", name=" + name + ", age=" + age + ", boardingpoint="
				+ boardingpoint + ", DestinationPoint=" + DestinationPoint + ", dateofdeparture=" + dateofdeparture
				+ ", payment=" + payment + "]";
	}
	public RegisterUser(int aadharno, String name, int age, String boardingpoint, String destinationPoint,
			Date dateofdeparture, boolean payment) {
		super();
		this.aadharno = aadharno;
		this.name = name;
		this.age = age;
		this.boardingpoint = boardingpoint;
		DestinationPoint = destinationPoint;
		this.dateofdeparture = dateofdeparture;
		this.payment = payment;
	}
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
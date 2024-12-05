package com.Advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String Uname;
	long Contact_no;
	String Email;
	String Password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public long getContact_no() {
		return Contact_no;
	}
	public void setContact_no(long contact_no) {
		Contact_no = contact_no;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public User(int id, String uname, long contact_no, String email, String password) {
		super();
		this.id = id;
		Uname = uname;
		Contact_no = contact_no;
		Email = email;
		Password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Uname=" + Uname + ", Contact_no=" + Contact_no + ", Email=" + Email + ", Password="
				+ Password + "]";
	}
	

}

package com.Advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Bid;
	String Bname;
	String BNo;
	String Type;
	public Buses(int bid, String bname, String bNo, String type) {
		super();
		Bid = bid;
		Bname = bname;
		BNo = bNo;
		Type = type;
	}
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getBNo() {
		return BNo;
	}
	public void setBNo(String bNo) {
		BNo = bNo;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "Buses [Bid=" + Bid + ", Bname=" + Bname + ", BNo=" + BNo + ", Type=" + Type + "]";
	}
	
	
	

}

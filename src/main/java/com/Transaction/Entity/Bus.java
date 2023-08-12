package com.Transaction.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	private int Busid;
	private String userName;
	private long email;
	private String busName;
	private int noOfSeat;
	private double price;
	private  double total;
	private Date date;
	public int getBusid() {
		return Busid;
	}
	public void setBusid(int busid) {
		Busid = busid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getEmail() {
		return email;
	}
	public void setEmail(long email) {
		this.email = email;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bus [Busid=" + Busid + ", userName=" + userName + ", email=" + email + ", busName=" + busName
				+ ", noOfSeat=" + noOfSeat + ", price=" + price + ", total=" + total + ", date=" + date + "]";
	}
	
	
	
	

}

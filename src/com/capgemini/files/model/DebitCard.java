package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard{
	private long cardnumber;
	private int cvv;
	private int expiryMonth;
	private int expiryYear;
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DebitCard(long cardnumber, int cvv, int expiryMonth, int expiryYear) {
		super();
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public String toString() {
		return "DebitCard [cardnumber=" + cardnumber + ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear="
				+ expiryYear + "]";
	}
	
	
}

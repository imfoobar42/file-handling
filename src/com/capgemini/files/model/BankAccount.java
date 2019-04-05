package com.capgemini.files.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BankAccount implements Serializable {

	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	private transient DebitCard debitCard;
	public BankAccount() {
		super();
	}
	public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalance,
			DebitCard debitCard) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.debitCard = debitCard;
	}
	
	private void writeObject(ObjectOutputStream outputStream) throws IOException
	{
		outputStream.defaultWriteObject();
		outputStream.writeLong(debitCard.getCardnumber());
		outputStream.writeInt(debitCard.getCvv());
		outputStream.writeInt(debitCard.getExpiryMonth());
		outputStream.writeInt(debitCard.getExpiryYear());
	}
	
	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException
	{
		inputStream.defaultReadObject();
		debitCard = new DebitCard(inputStream.readLong(),inputStream.readInt(),inputStream.readInt(),inputStream.readInt());
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", debitCard=" + debitCard + "]";
	}
	
	
}

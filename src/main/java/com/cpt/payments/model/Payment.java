package com.cpt.payments.model;

public class Payment {

	private String name;
	private String phone;
	private int amount;
	private String transactionType;
	private String transactionStatus;
	private String transactionId;
	
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Payment(String name, String phone, int amount, String transactionType, String transactionStatus) {
		super();
		this.name = name;
		this.phone = phone;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionStatus = transactionStatus;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}




	public String getTransactionStatus() {
		return transactionStatus;
	}


	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}




	public String getTransactionId() {
		return transactionId;
	}




	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}




	@Override
	public String toString() {
		return "Payment [name=" + name + ", phone=" + phone + ", amount=" + amount + ", transactionType="
				+ transactionType + ", transactionStatus=" + transactionStatus + ", transactionId=" + transactionId
				+ "]";
	}
	
	
	
	
}

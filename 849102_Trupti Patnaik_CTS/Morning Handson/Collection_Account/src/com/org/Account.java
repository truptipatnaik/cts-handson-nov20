package com.org;

public class Account {

	private int accountNum;
	private String name;
	private int accountBalance;
	
	
	public Account(int accountNum, String name, int accountBalance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.accountBalance = accountBalance;
	}
	public int getAccountNo() {
		return accountNum;
	}
	public void setAccountNo(int accountNo) {
		this.accountNum = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNum + ", name=" + name + ", accountBalance=" + accountBalance + "]";
	}
	
}

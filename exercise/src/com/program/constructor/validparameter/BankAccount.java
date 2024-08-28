package com.program.constructor.validparameter;

/*
  Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
  
 */


public class BankAccount {
	private String accno;
	private double balance;
	
	public BankAccount(String accno,double balance) {
		//invalid accno
		if(accno == null||accno.isEmpty()) {
			System.err.println("Account Number cannot be null or empty");
		}
		//invalid balance
		if(balance<=0) {
			System.err.println("balance should be non negative");
		}
		
		this.accno=accno;
		this.balance=balance;
	}
	//create method
	public void bankAccount() {
		System.out.println("Account number :"+accno);
		System.out.println("Balance :"+balance);
	}
	
}

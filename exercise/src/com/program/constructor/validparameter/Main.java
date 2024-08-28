package com.program.constructor.validparameter;

public class Main {
	public static void main(String[]args){
		//give valid input
		BankAccount ba=new BankAccount("45687368439",200);
		ba.bankAccount();
		
		//give invalid input
		BankAccount ba2=new BankAccount("",200);
		BankAccount ba3=new BankAccount("45687368439",-200);

		
	}
}

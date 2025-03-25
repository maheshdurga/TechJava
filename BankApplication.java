package com.Programs;

public class BankApplication {
	 static int amountBalance=1000;
	String holderName;
	static void greetCustmor(){
		System.out.println("Hello Welcome to Bank Website");
		
	}
	void details() {
		System.out.println("Hi Your Bank Balance :"+amountBalance);
	}
	static void deposite(int amount) {
		if(amountBalance >= amount) {
		amountBalance += amount;
		
		 System.out.println("your deposite amount :"+amount);
		 System.out.println("your current Balance :"+amountBalance);
		}
	 }
	 
	void withdraw(int cash) {
		if(amountBalance >= cash) { 
		amountBalance -= cash;
		
		 System.out.println("your withdraw amount :"+cash);
		 System.out.println("your current Balance :"+amountBalance);
		}
		
	}
	void credit() {
		
		
	}

	public static void main(String[] args) {
		greetCustmor();
		BankApplication ob = new BankApplication();
		ob.details();
		deposite(100);
		ob.withdraw(200);
		
	
		

	}

}

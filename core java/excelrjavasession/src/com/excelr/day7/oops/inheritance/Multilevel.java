package com.excelr.day7.oops.inheritance;

class Bank
{
	void bankdetails()
	{
		System.out.println("BankName :Axis bank");
		System.out.println("ifsc     : 67878787");
	}
	
}

class Account extends Bank
{
	void personalInfo()
	{
		System.out.println("ACC-NO : 778898999900008");
		System.out.println("PAN-NO :dgd6788");
	}
}

class SavingAccount extends Account
{
	void cardDetails()
	{
		System.out.println("daily limit : 3 lakh");
		System.out.println("forex : eligible");
	}
}


public class Multilevel {

	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount();
		savingAccount.bankdetails();
		savingAccount.personalInfo();
		savingAccount.cardDetails();
	}

}

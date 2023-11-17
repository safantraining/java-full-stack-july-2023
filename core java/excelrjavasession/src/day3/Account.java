package day3;

public class Account {

	int balance;
	String accountNo;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int balance, String accountNo) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
	}

	
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	int deposit(int amount)
	{
		return this.balance+=amount;
	}
	
	int withdraw(int amount)
	{
		return this.balance-=amount;
	}
	
	int getBalance()
	{
	 return	this.balance;
	}
}

package com.exception;

//Create a custom exception class and use it in your program.

class InsufficientFundsException extends Exception 
{
	public InsufficientFundsException(String message) 
	{
		super(message);
	}
}



class BankAccount
{
	private double balance;

	public BankAccount(double balance) 
	{
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException 
	{
		if (amount > balance) 
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}
	

	public double getBalance() 
	{
		return balance;
	}
}



public class Exception_Three 
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount(100.0); 
		
		try 
		{ 
			account.withdraw(150.0); // This will throw InsufficientFundsException 
		} 
		catch (InsufficientFundsException e) 
		{ 	
			System.out.println("Exception caught: " + e.getMessage()); 
		}
		try 
		{ 
			account.withdraw(50.0); // This will be successful 
		} 
		catch (InsufficientFundsException e) 
		{ 
			System.out.println("Exception caught: " + e.getMessage()); 
		}
	}
}

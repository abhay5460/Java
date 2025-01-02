package com.technical;

//Implement an interface for a real-world example, such as a payment gateway.

class PayPalPayment implements payment
{
	@Override
	public boolean processPayment(double amount) 
	{
		System.out.println("Processing PayPal payment of " + amount + " units.");
		return true;
	}

	@Override
	public void generateReceipt() 
	{
		System.out.println("Generating PayPal payment receipt.");
	}
}


class CreditCardPayment implements payment
{
	@Override
	public boolean processPayment(double amount)
	{
		System.out.println("Processing credit card payment of " + amount + " units.");
		return true;
	}

	@Override
	public void generateReceipt()
	{
		System.out.println("Generating credit card payment receipt.");
	}
}


public class Inter_abstract3 
{
	public static void main(String[] args)
	{
		payment paypalPayment = new PayPalPayment();
		payment creditCardPayment = new CreditCardPayment();
		
		paypalPayment.processPayment(100.0);
		paypalPayment.generateReceipt();
		
		creditCardPayment.processPayment(200.0);
		creditCardPayment.generateReceipt();
	}
}






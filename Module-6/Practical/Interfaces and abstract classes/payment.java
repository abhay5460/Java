package com.technical;

public interface payment 
{
	boolean processPayment(double amount);
	void generateReceipt();
}

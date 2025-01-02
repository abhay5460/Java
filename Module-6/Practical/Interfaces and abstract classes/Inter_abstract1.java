package com.technical;
//Create an abstract class and implement its methods in a subclass.

abstract class Vehicle 
{
	public abstract void startEngine();
 
	public void stopEngine() 
	{
		System.out.println("The vehicle's engine has stopped.");
	}
}

class Car extends Vehicle 
{
	@Override
	public void startEngine() 
	{
		System.out.println("The car's engine starts with a roar.");
	}
}

public class Inter_abstract1 
{
	public static void main(String[] args) 
	{
		Car obj1 = new Car();
		
		obj1.startEngine();
		
		obj1.stopEngine();
	}
}


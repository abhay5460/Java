package com.technical;

///Write a program that implements multiple interfaces in a single class.

interface Drivable 
{
	void drive();
}

interface Flyable 
{
	void fly();
}

class FlyingCar implements Drivable, Flyable 
{
	@Override
	public void drive() 
	{
		System.out.println("The car is driving on the road.");
	}

	@Override
	public void fly() 
	{
		System.out.println("The car is flying in the sky.");
	}
}

public class Inter_abstract2 
{
	public static void main(String[] args) 
	{
		FlyingCar myFlyingCar = new FlyingCar();
     
     	myFlyingCar.drive(); 
     	myFlyingCar.fly();   
	}
}

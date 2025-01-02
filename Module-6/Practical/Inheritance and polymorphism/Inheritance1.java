package com.OOPS;
//Write a program that demonstrates inheritance using extends keyword


class AnimalG 
{
	public void eat() 
	{
		System.out.println("This animal eats food.");
	}
}

class DogG extends AnimalG 
{
	public void bark() 
	{
		System.out.println("The dog barks.");
	}

	@Override
	public void eat() 
	{
		System.out.println("The dog eats bones.");
	}
}

public class Inheritance1
{
	public static void main(String[] args)
	{
		DogG myDog = new DogG();
     
		myDog.eat();  
		myDog.bark(); 
	}
}


package com.OOPS;

//Implement runtime polymorphism by overriding methods in the child class.

class Kajal
{
	public void makeSound()
	{
		System.out.println("This Kajal makes a sound.");
	}
}

class DogR extends Kajal
{
	@Override
	public void makeSound()
	{
		System.out.println("The DogR barks.");
	}
}

class catR extends Kajal
{
	@Override
	public void makeSound()
	{
		System.out.println("The catR mews.");
	}
}

public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Kajal obj1 = new Kajal();
		DogR obj2 = new DogR();
		catR obj3 = new catR();
		
		obj1.makeSound();
		obj2.makeSound();
		obj3.makeSound();
	}
}





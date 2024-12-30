package com.OOPS;

//Write a program demonstrating single inheritance

class Animal 
{
    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal 
{
    void bark() 
    {
        System.out.println("The dog barks.");
    }
}

public class oops4 
{
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
        dog.eat();
        dog.bark(); 
	}
}

package com.OOPS;

// Create a class hierarchy and demonstrate multilevel inheritance.

class A
{
    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}

class B extends A
{
    void walk() 
    {
        System.out.println("This mammal walks.");
    }
}

class D extends B 
{
    void bark() 
    {
        System.out.println("The dog barks.");
    }
}

public class oops5 
{
	public static void main(String[] args) 
	{
		D obj = new D();
	    obj.eat(); 
	    obj.walk(); 
	    obj.bark(); 
	}
}

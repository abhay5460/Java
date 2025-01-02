package com.OOPS;
//Use the super keyword to call the parent class constructor and methods.

class First1
{
	public First1()
	{
		System.out.println("This is First Character");
	}
	
	int fno;
	public void setFNo()
	{
		fno=123;
	}
}

class Second1 extends First1
{
	public Second1()
	{
		System.out.println("This is Second Constructor.");
	}
	int fno;
	public void display()
	{
		setFNo();
		System.out.println("Fno is.."+super.fno);
		System.out.println("Fno is.."+fno);
	}
}
public class Inheritance3
{
	public static void main(String[] args) 
	{
		Second1 s1 = new Second1();
		//s1.setFNo();
		s1.display();
	}
}

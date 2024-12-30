package com.OOPS;

//Implement method overriding to show polymorphism in action.

class Ant
{
	public void show()
	{
		System.out.println("This is an ant.");
	}
}

class Sky extends Ant
{
	public void show()
	{
		System.out.println("This is an sky.");
	}
}

public class oops6 
{
	public static void main(String[] args) 
	{
//		Sky s1 = new Sky();
//		s1.show();
		
		Ant a1 = new Ant();
		a1.show();
		a1 = new Sky();
		a1.show();
	}
}

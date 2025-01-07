package com.Package;

//Demonstrate the use of different access modifiers within the same package and across different packages.

public class Same_Package 
{
	public static void main(String[] args) 
	{
	     Package1 obj = new Package1();
	     
	     System.out.println("Accessing public field: " + obj.publicField);
	     obj.publicMethod();

	     System.out.println("Accessing protected field: " + obj.protectedField);
	     obj.protectedMethod();

	     System.out.println("Accessing default field: " + obj.defaultField);
	     obj.defaultMethod();

	     obj.displayPrivateField();
	     obj.callPrivateMethod();
	}
}



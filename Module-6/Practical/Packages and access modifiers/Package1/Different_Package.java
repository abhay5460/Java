package com.Package1;

////Demonstrate the use of different access modifiers within the same package and across different packages.


import com.Package.Package1;

public class Different_Package 
{
	public static void main(String[] args)
	{
		Package1 obj = new Package1();

		System.out.println("Accessing public field: " + obj.publicField);
		obj.publicMethod();

		SubClass subclassObj = new SubClass();
//		System.out.println("Accessing protected field: " + subclassObj.protectedField);
//		subclassObj.protectedMethod();
		subclassObj.accessProtectedMember();
	}
}


class SubClass extends Package1 
{
	public void accessProtectedMember()
	{
		System.out.println("Accessing protected field in subclass: " + protectedField);
		protectedMethod();
	}
}






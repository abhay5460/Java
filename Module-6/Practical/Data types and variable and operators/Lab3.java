package com.simple2;

public class Lab3 
{
	public static void main(String[] args)
	{
		int i1=100; // 4 byte
		long l1; // 8 byte
		
		l1=i1; // implicit
		System.out.println("Implicit is : "+l1);
		
		int z1;
		z1=(int)l1;
		System.out.println("Explicit is : "+z1);
		
		int a1=127; // 4 byte
		byte b1; // 1 byte
		
		b1=(byte)a1;
		
		System.out.println("Explicit is :"+b1);
	}
}

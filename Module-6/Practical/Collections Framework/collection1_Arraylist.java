package com.collection;

//Write a program that demonstrates the use of an ArrayList and LinkedList.

import java.util.ArrayList;
import java.util.List;

public class collection1_Arraylist 
{
	 public static void main(String[] args)
	 {
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Abhay");
	        arrayList.add("Raj");
	        arrayList.add("Ambani");

	        System.out.println("ArrayList elements:");
	        for (String element : arrayList)
	        {
	            System.out.println(element);
	        }
	 }
}


package com.collection;

////Write a program that demonstrates the use of an ArrayList and LinkedList.

import java.util.LinkedList;
import java.util.List;

public class collection1_linkedlist 
{
	public static void main(String[] args) 
	{
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Anill Ambani");
        linkedList.add("Shree Leela");
        linkedList.add("Ram and Sita");

        System.out.println("LinkedList elements:");
        for (String element : linkedList)
        {
            System.out.println(element);
        }
    }
}



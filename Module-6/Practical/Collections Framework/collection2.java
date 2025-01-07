package com.collection;

// Implement a program using HashSet to remove duplicate elements from a list.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collection2 
{
	public static void main(String[] args) 
	{
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Ram");
        listWithDuplicates.add("Hanuman");
        listWithDuplicates.add("Radha");
        listWithDuplicates.add("Arjun");
        listWithDuplicates.add("Ram");

        System.out.println("List with duplicates: " + listWithDuplicates);

        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}


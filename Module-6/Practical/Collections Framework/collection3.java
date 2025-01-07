package com.collection;

//Create a HashMap to store and retrieve key-value pairs.

import java.util.HashMap;
import java.util.Map;

public class collection3
{
    public static void main(String[] args) 
    {
        Map<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        int value = hashMap.get("Two");
        System.out.println("Value for key 'Two': " + value);

        System.out.println("All key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


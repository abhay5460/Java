package com.Array;

//Create a class with static variables and methods to demonstrate their use.

public class method3
{
    static int count = 0;

    public static int incrementCount() 
    {
        count++;
        return count;
    }

    public void displayCount() 
    {
        System.out.println("Current count: " + count);
    }

    public static void main(String[] args) 
    {
        System.out.println("Initial count: " + method3.count);
        System.out.println("Incremented count: " + method3.incrementCount());

        method3 obj1 = new method3();
        method3 obj2 = new method3();

        obj1.displayCount();
        obj2.displayCount();

        method3.incrementCount();

        obj1.displayCount();
        obj2.displayCount();
    }
}

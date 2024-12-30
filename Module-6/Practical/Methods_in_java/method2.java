package com.Array;

//Implement method overloading by creating methods for different data types.

public class method2 
{
    public int add(int a, int b) 
    {
        return a + b;
    }

    public double add(double a, double b) 
    {
        return a + b;
    }

    public String add(String a, String b) 
    {
        return a + b;
    }

    public static void main(String[] args) 
    {
        method2 obj = new method2();

        int sumInt = obj.add(5, 10);
        System.out.println("Sum of integers : " + sumInt);

        double sumDouble = obj.add(5.5, 10.5);
        System.out.println("Sum of doubles : " + sumDouble);

        String sumString = obj.add("Hello, ", "world!");
        System.out.println("Concatenated strings : " + sumString);
    }
}

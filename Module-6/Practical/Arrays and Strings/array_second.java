package com.Array;
// Create a program to reverse a string and check for palindromes.
public class array_second 
{
	public static void main(String[] args) 
	{
		String original = "madam";
		String reversed = reverseString(original);
		
		System.out.println("Original String : "+original);
		System.out.println("Reversed String : "+reversed);
		
		if(isPalindrome(original))
		{
			System.out.println("The String \""+ original + "\" is a palindrome .");
		}
		else
		{
			System.out.println("The string \""+ original + "\" is not a palindrome.");
		}
	}
	
	public static String reverseString(String str) 
	{
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) 
    {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }	
}

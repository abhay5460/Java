package com.Array;

//Demonstrate constructor overloading by passing different types of parameters.

public class Constructor2 
{
	private String title;
    private String author;
    private int pages;

    public Constructor2(String title, String author, int pages) 
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Constructor2(String title, String author) 
    {
        this(title, author, 0); 
    }
	
    public Constructor2(String title) 
    {
        this(title, "Unknown", 0); 
    }

    public void displayDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    public static void main(String[] args) 
    {
     
        Constructor2 book1 = new Constructor2("Effective Java", "Joshua Bloch", 416);
        Constructor2 book2 = new Constructor2("Clean Code", "Robert C. Martin");
        Constructor2 book3 = new Constructor2("Refactoring");

      
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
    }
}

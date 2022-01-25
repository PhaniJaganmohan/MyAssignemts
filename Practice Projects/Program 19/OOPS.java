package com.jagan.learning;

import java.util.Scanner;

public class OOPS
{  
	public static void main(String[] args) 
    { 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter name of the dog ");
		String name = scan.nextLine();
		System.out.println("Enter the breed of the dog ");
		String breed = scan.nextLine();
		System.out.println("Enter the age ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the colour ");
		String colour = scan.nextLine();
		
        OOPS ref = new OOPS(name, breed, age, colour); 
        System.out.println(ref.toString()); 
    } 
    String name; 
    String breed; 
    int age; 
    String color; 
    public OOPS(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ "\nMy breed is " + this.getBreed()+"\nMy age is " + this.getAge()+ "\nMy colour is "+ this.getColor()); 
    } 
    
}

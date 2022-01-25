package www.jagan.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Strings you want to enter");
		int num= scan.nextInt();
		String []list= new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter your String");
			list[i]=scan.next();
		}
		System.out.println("Enter your desired string to search");
		String search=scan.next();
		boolean flag=false;
		for(String element : list) {
			
			if(element.contains(search)) 
			flag=true;
		}
		if(flag)
				System.out.println("String found :"+ search);
			
			
			else 
				System.out.println("String not found");
			
			}
		}
				
	

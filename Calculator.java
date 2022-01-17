package www.jagan.learning;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float result=0;
		System.out.println("Enter two numbers to perform the operation : ");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextInt();
		float num2 = scan.nextInt();
		boolean exit=true;
		while(exit) {
		System.out.println("What operation do you want to perform\n");
		String message = """
					1. Addition
					2. Subtraction
					3. Multiplication
					4. Division
					5. Exit
					Please enter your choice of number...					
				""";
		message=String.format(message);
        System.out.println(message);
		
		int choice = scan.nextInt();
		switch(choice) {
		case 1 :
			result=(num1+num2);
			break;
		case 2 :
			result=(num1-num2);
			break;
		case 3 :
			result=(num1*num2);
			break;
		case 4 :
			result=(num1/num2);
			break;
		case 5 :
			  exit=false;
			  break;
			
		default :
			System.out.println("Invalid Operation...!");
			
		}
		if(choice>0&&choice<6)
			System.out.println("Result = "+ result);
		}
	}
	
}
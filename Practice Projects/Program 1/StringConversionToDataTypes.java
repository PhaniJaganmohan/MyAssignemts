package www.jagan.learning;

import java.util.Scanner;

public class StringConversionToDataTypes {

	public static void main(String[] args) {
		System.out.println("Entet the string to convert");
		Scanner scan = new Scanner(System.in);
		String string= scan.nextLine();
		
		System.out.println("converting String to int");
		try{
			System.out.println(Integer.parseInt(string));
		}catch(NumberFormatException ex) {
			System.out.println("wrong input");
			ex.printStackTrace();
		}
	}

}

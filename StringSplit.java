import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		int i;
		System.out.println("enter your string");
		Scanner scan = new Scanner(System.in);
		String myStr=scan.nextLine();
		System.out.println("enter at where split to be done:");
		String splittingAt=scan.nextLine();
		
		for(i=0;i<myStr.length();i++) {
			if(myStr.charAt(i)==splittingAt.charAt(0)) {
				myStr=myStr.substring(0,i)+" "+myStr.substring(i+1);
				
			}
		}
		System.out.println("after splitting:"+ myStr);
	}
}

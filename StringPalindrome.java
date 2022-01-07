import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		System.out.println("enter your string: ");
		Scanner scan=new Scanner(System.in);
		String myStr=scan.nextLine();
		String revStr="";
		for(int i=myStr.length()-1;i>=0;i--) {
			revStr+=myStr.charAt(i);
		}
		System.out.println("reverse of "+myStr+ " is "+revStr);
		boolean flag=false;
		for(int i=0;i<myStr.length();i++){
		if(myStr.charAt(i)==revStr.charAt(i)) {
			flag=true;
		}
		}
		
		if(flag) {
			System.out.println(myStr+" is a Palindrome");
		}
		else {
			System.out.println(myStr+" is not a Palindrome");
		}
		
		
	}

}

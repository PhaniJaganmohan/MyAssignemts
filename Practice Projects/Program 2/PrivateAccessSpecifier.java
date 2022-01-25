package www.jagan.learning;

public class PrivateAccessSpecifier {
		   private void display() { 
		        System.out.println("You are using private access specifier"); 
		    } 
			public static void main(String[] args) {
				//private
				System.out.println("Private Access Specifier");
				PrivateAccessSpecifier  obj = new PrivateAccessSpecifier(); 
		        obj.display();
			}
		}
package www.jagan.learning;

public class PublicAccessSpecifier {
	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 

	public static void main(String[] args) {
	
		PublicAccessSpecifier obj = new PublicAccessSpecifier(); 
        obj.display();  	
	}
}

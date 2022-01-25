package www.jagan.learning;

public class ProtectedAccessSpecifier {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
	public static void main(String[] args) {
		ProtectedAccessSpecifier obj = new ProtectedAccessSpecifier ();   
	       obj.display();  
	}
}
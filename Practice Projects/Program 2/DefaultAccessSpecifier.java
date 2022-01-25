package www.jagan.learning;

public class DefaultAccessSpecifier {
	void display() 
    { 
        System.out.println("You are using defalut access specifier"); 
    } 
	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		DefaultAccessSpecifier obj = new DefaultAccessSpecifier(); 		  
       obj.display(); 
	}
}
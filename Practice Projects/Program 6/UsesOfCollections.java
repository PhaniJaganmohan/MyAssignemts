package www.jagan.learning;

import java.util.ArrayList;
import java.util.Collections;
public class UsesOfCollections
{
	public static void main(String[] args){
			
		ArrayList<String> ref=new ArrayList<String>();  
			
		System.out.println("Initial size of Arraylist is "+ ref.size());  
		ref.add("Hai");
		ref.add("How are You?");
		System.out.println("Arraylist is "+ref);
		System.out.println("New size of Arraylist is "+ref.size()); 
		
		ref.add(0,"Hey!"); // 0 indicates the index where we want to add our string in list
		System.out.println("New Arraylist is "+ref);
		System.out.println("New size of Arraylist is "+ref.size());
			
		System.out.println("element at position 1 is  : "+ ref.get(1)); // position of element at index 1
		
		Collections.reverse(ref);   //Reversing order of arraylist
		System.out.println("Reversed arraylist is : "+ ref);    // Printing arraylist after reversing
		
		ref.set(2, "Bye"); // set - it replaces the string with given one
	    System.out.println("ArrayList after setting/replacing element at position 2 is : " + ref);
	        
	    ref.remove(2);
	    System.out.println("New Arraylist is "+ref);
	        
	    ref.remove("Hello");
	    System.out.println("New Arraylist is "+ref);
	        
	    System.out.println(ref.contains("Hello"));
	       
	        
	        
	        
		}
	}


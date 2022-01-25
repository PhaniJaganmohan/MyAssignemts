package www.jagan.learning;

import java.util.Scanner;

public class OperationsOnStack 
{ 
	public static void main(String args[]){
		int value;
		OperationsOnStack stack = new OperationsOnStack(); 
		while(true){
			
		 String message = """
		 Enter your option
			1. Push
			2. Pop
			3. Display
		 4. Exit
	  -------
		 		""" ;
		 message=String.format(message);
	        System.out.println(message);

		 Scanner scan = new Scanner(System.in);
		 int option=scan.nextInt();
		 
			 switch(option) {
			 case 1 :
				 System.out.println("Enter the value to Push :");
				 value=scan.nextInt();
				 stack.push(value);
				 break;
			 case 2 :
				 stack.pop();
				 break;
			 case 3 :
				 stack.display();
				 break;
				 default :
					 System.out.println("Wrong option. Please enter a valid one :");
					 return;
			 
			 }
		 }
		
}
	
    	static final int max = 1000; 
    	int top=-1;
    	int arrayOfStack[] = new int[max]; 
    	
    	public void push(int value) {
    		if(top==max-1)
    		{
    			System.out.println("Stack is Full ");
    			
    		}
    		else {
    			top++;
    			arrayOfStack[top]=value;
    			System.out.println(value+" is Pushed into the Stack\n");
    			
    		}
    		
 
    	}
    	public void pop() {
    		int x;
    		if(top==-1)
    		{
    			System.out.println("Stack is Empty");
    		}
    		else {
    			x=arrayOfStack[top];
    			System.out.println(x+" is deleted from stack\n");
    			top--;
    			
    		}
    			
    	}
    	public void display() {
    		int i;
    		if(top==-1)
    			System.out.println("Stack is Empty");
    		else {
    			System.out.println("The elements in the Stack are : ");
    			for(i=0;i<=top;i++)
    				System.out.println(arrayOfStack[i]);
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
} 

    	
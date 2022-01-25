package www.jagan.learning;

public class TryCatchBlocks {
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[5]=30; 
             a[6]=9;                                                        
            }    
           catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }  
        
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
        
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }     
        finally{ // finally executes even there is an exception
     	   System.out.println("Finally");
        }
        
                
 }  

}

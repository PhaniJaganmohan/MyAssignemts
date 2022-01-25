package www.jagan.learning;
public class ThreadCreationMechanism extends Thread
{
	public void run()
	{  
		for(int i=1;i<=5;i++)
		{  
		   try
		   {  
			   Thread.sleep(500);  
		   }
		    catch(Exception e)
		   {
			   System.out.println(e);
		   }  
		   System.out.println(i);  
		  }  
	   }  
		 
	public static void main(String args[])
	{  
		
		 ThreadCreationMechanism t1=new ThreadCreationMechanism();  
		 ThreadCreationMechanism t2=new ThreadCreationMechanism();  
		 ThreadCreationMechanism t3=new ThreadCreationMechanism();  
		 t1.start();  
		 
		 try
		 {  
			 t1.join();  
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }  
		  
		 t2.start();  
		 t3.start();  
		 }  
		}  




class ThreadsRunnable  implements Runnable
{  
	
	public  void run()
	{  
		System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[])
	{  
	
		ThreadsRunnable m1=new ThreadsRunnable();       
		Thread t1 = new Thread(m1);                     
		t1.start();                                     
	}  
} 

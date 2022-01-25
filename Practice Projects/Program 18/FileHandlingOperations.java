package www.jagan.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingOperations 
{
	public static void main(String[] args) 
	{
		//Create a file
		 File folder = new File("D:\\lms\\");
		 folder.mkdir();
		 File file=new File(folder,"Text.txt");
		  try 
		  {  
	            if (file.createNewFile()) 
	            {  
	                System.out.println("New File is created!");  
	            } 
	            else 
	            {                   
	               if(file.exists())
	               {
	                    System.out.println("File already exists.");	
	                   
	               }
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }
	        
		   
		   //Write operation
		  PrintWriter writer;
			try {
				writer = new PrintWriter(new File("D:\\lms\\Text.txt"));
				writer.println("Hello how are you doing?");
				writer.flush();
				writer.close();
				System.out.println("Write Operation done successfully");
			} catch (FileNotFoundException e) {
				System.out.println("SOme issues : " + e.getMessage());
			}
		    //Read operation
			StringBuilder builder = new StringBuilder("");

			try {
				String data = "";
				
				 BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\lms\\Text.txt")));
				
				while((data = reader.readLine())!= null) {
					builder.append(data + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("Some issues : " + e.getMessage());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Read operation:");
			System.out.println("Data in the file :");
			
			System.out.println(builder);
			
			// Rename a file
			file.renameTo(new File(file,"newText.txt"));
			
		//Delete
			 	file.delete();
				System.out.println("file deleted successfully");
				
				
	}
}

		  

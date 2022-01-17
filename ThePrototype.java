package www.jagan.learning;


import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ThePrototype {
    static String Path;
    File folder;
    
    public static void main(String[] args)  {
       
    	 System.out.println(Welcome); 
        ThePrototype showMenu = new ThePrototype();
		showMenu.primaryMenu();
    }

    public  ThePrototype()  {
    	System.out.println("Enter the Path where you want to create your folder");
    	Scanner scan = new Scanner(System.in);
			Path = scan.next();
			System.out.println("Enter the name of the folder");
        folder = new File(Path+scan.next());
        folder.mkdirs();
        System.out.println("Directory : "+ folder.getAbsolutePath());                     
    }
    private static final String Welcome = 
    		"		Application name		";
     

     void primaryMenu()  {
        String message= """
        							\n   Main Menu
        		        	Choose any option from the below:       		
        					1.  List files in directory
        					2.  Add, Delete or Search
        					3.  Exit Program 
        					""";
        message=String.format(message);
        System.out.println(message);
        try{
        	Scanner scanner = new Scanner(System.in);
            
        	int option = scanner.nextInt();
        	
        	
            switch (option){
                case 1 : {
                    showFiles();
                    
                }
                case 2 : {
                    showSecondaryMenu();
                }
                case 3 : {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default:
                	System.out.println("Please choose the options 1,2,3 only");
                	primaryMenu();
            }
        }
        
        catch(InputMismatchException ex) {
        	System.out.println("Invalid input. Integers only");
        	primaryMenu();
        }
    }
    
     void showFiles()  {
         if (folder.list().length==0)
             System.out.println("The folder is empty");
         else {
             String []listOfFiles = folder.list();
             System.out.println("The files available in "+ folder +" are :");
             Arrays.sort(listOfFiles);
             for (String string:listOfFiles) {
                 System.out.println(string);
             }
         }
         primaryMenu();
     }

    void showSecondaryMenu() {
    	String message="""
    			Choose from below :
    			A. Add a File
    			B. Delete a File
    			C. Search a File
    			D. Go back to Main Menu
    			
    			""";
    	message=String.format(message);
        System.out.println(message);
        try
        {
        	Scanner scanner = new Scanner(System.in);
            char option = scanner.next().toUpperCase().charAt(0);
            
            switch (option){
                case 'A' : {
                    System.out.println("Please Enter a File Name : ");
                    String name = scanner.next().toLowerCase().trim();
                    addFile(name);
                    break;
                }
                case 'B' : {
                    System.out.println("Please Enter The File Name To Delete : ");
                    String filename = scanner.next().trim();
                    deleteFile(filename);
                    break;
                }
                case 'C' : {
                    System.out.println("Searching a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    searchFile(filename);
                    break;
                }
                case 'D' : {
                    System.out.println("Going Back to MAIN menu");
                    primaryMenu();
                    break;
                }
                default : System.out.println("Please enter A, B, C, D only ");
            }
            showSecondaryMenu();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input");
            showSecondaryMenu();
        }
    }

    
    void addFile(String filename)  {
        File path = new File(folder +"/"+filename);
        String[] listOfFiles = folder.list();
        for (String file: listOfFiles) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println(filename + " already exists at ");
                return;
            }
        }
        try {
			path.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        System.out.println(filename+" added to "+ folder);
    }

    void deleteFile(String filename) {
        File file = new File(folder +"/"+filename);
        String []listOfFiles = folder.list();
        for (String files: listOfFiles) {
            if (filename.equals(files)) {
            	file.delete();
                System.out.println( filename + "was deleted successfully");
                return;
            }
            else
            	System.out.println("File not found");
        }
        
    }

    void searchFile(String filename) {
        String[] list = folder.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("File Founded"+"\n"+"Filename: "+filename + " Path : " + folder);
                return;
            }
            else
            	System.out.println("File not found");
        }
        
    }

    
}
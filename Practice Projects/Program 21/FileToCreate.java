package com.jagan.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileToCreate {
   public static void main(String[] args) {
      
	
      Path path = Paths.get("E:/Documents/Demo.txt");
      
        try {
         Path createdFilePath = Files.createFile(path);
         System.out.println("Created a file at : "+createdFilePath);
      } 
      catch (IOException e) {
         e.printStackTrace();
      }
      
      
      Path pathw = Paths.get("E:/Documents/Demo.txt");
      String question = "To be or not to be?";
    
      try {
         Files.write(pathw, question.getBytes());
         List<String> lines = Files.readAllLines(pathw);
         for (String line : lines) {
            System.out.println(line);
         }
      } 
      catch (IOException e) {
         System.out.println(e);
      }
      
   }
}

/*Ontefetse Ditsele
 *
 *29 July 2020
*/

package Unix.Question_5;

import java.io.*;
//import java.util.*;

public class DamArrayApp{
   private DamArrayApp(){}
   
   private static String path = "C:/Users/connex/OneDrive/Desktop/Zaio_deliverables/Unix/Question_5/dam_levels.csv";
   private static String nFilePath = "C:/Users/connex/OneDrive/Desktop/Zaio_deliverables/Unix/Question_5/dam_levels.txt";
   
   private static String[] lineValues;
   private static String  FileContents = "";
   static String line = "";//static String fscLevel = "";static String damLevel = ""; 

   
   private static BufferedReader read;
   private static FileWriter  write; 
      
   public static void main(String[] args){
      try{
         read = new BufferedReader(new FileReader(path));
         write = new FileWriter(nFilePath,true);
         
            
      
      if(args.length > 0){ printDam(args[0]);}
      
      else{/* printAll();*/ /*printDam("Pella Dam");  printDam("Madikwe Dam"); *printDam("Molatedi Dam");*/ printDam("Saulspoort Dam");}
      
      write.write(FileContents);
      write.close();
      
      }catch(FileNotFoundException e){ System.out.println("File does not exist"); }
       catch(IOException e){ System.out.println("What file now");  }
 
   }
   
   public static void printDam(String damName){
      String tName; String oName;     
      try{
         while((line = read.readLine()) != null){
            lineValues = line.split(",");
            
            tName      = lineValues[2];            
            tName = tName.replace(" ",""); tName = tName.substring(1, tName.length() -1);
            oName = damName.replace(" ","");
            
            if(tName.equalsIgnoreCase(oName)){
               if(lineValues.length >= 25){
                 
                  write.write("Dam Name: "+damName +"\nFSC: "+lineValues[10]+"\nDam Level: "+lineValues[25]+"\n\n");
               }
               //else{ System.out.println(damName +" Have missing Values."); }
            }
            //else{ System.out.println("Dam Not Found"); }
            
         }
      
      }catch(IOException e){
         System.out.println("Could not read line");}
   }
   
   public static void printAll(){
   String dam = "";
      try{
         while((line = read.readLine()) != null){
            lineValues = line.split(",");
            if(lineValues.length >= 25){
                                    
               dam = lineValues[2].replace(" ","");
               if(dam.contains("Dam")){
                  write.write(lineValues[2] +"   "+lineValues[10]+"   "+lineValues[25]+"\n");
               }
               //else{ System.out.println("Wrong values"); }
            }
            //else{ System.out.println("Row have missing values"); } 
         }
       }catch(IOException e){
            System.out.println("Could not read line");}
      
      }      
  } 
 
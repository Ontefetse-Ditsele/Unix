/*Ontefetse Ditsele
 *
 *29 July 2020
*/

//package Unix.Question_5;


import java.io.*;

public class DamArrayApp{
   private DamArrayApp(){}
   
   private static String path = "C:/Users/connex/OneDrive/Desktop/Zaio_deliverables/Unix/Question_5/bin/dam_levels.csv";
   private static String nFilePath = "C:/Users/connex/OneDrive/Desktop/Zaio_deliverables/Unix/Question_5/bin/dam_levels.txt";
   
   private static String[] lineValues;
   private static String line = ""; 

   
   private static BufferedReader read;
   private static FileWriter  write; 
      
   public static void main(final String[] args){
      try{
         read = new BufferedReader(new FileReader(path));
         write = new FileWriter(nFilePath,true);
      
         if(args.length > 0){ printDam(args[0]); }
         else{ printAll(); }
      
   
         write.close();
      
      }catch(final FileNotFoundException e){ System.out.println("File does not exist"); }
       catch(final IOException e){ System.out.println("What file now");  }
 
   }
   
   public static void printDam(final String damName){
      String tName; String oName;     
      try{
         while((line = read.readLine()) != null){
            lineValues = line.split(",");
            
            //Cleaning data to make it easier to compare dam Names.
            tName      = lineValues[2];            
            tName = tName.replace(" ",""); tName = tName.substring(1, tName.length() -1);
            oName = damName.replace(" ","");
            
            if(tName.equalsIgnoreCase(oName)){
               if(lineValues.length >= 25){
                 
                  write.write("Dam Name: "+damName +"\nFSC: "+lineValues[10]+"\nDam Level: "+lineValues[25]+"\n\n");
               }  
            }
         }
      
      }catch(final IOException e){ System.out.println("Could not read line"); }
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
            } 
         }
       }catch(final IOException e){
            System.out.println("Could not read line");}
      
      }      
  } 
 
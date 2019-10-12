import java.util.*;

import java.io.*;

import ou.*;
/**
 * Write a description of class WCCR here.
 * 
 * @author (Kyan Keise D1505719) 
 * @version (01/05/2019)
 */
public class WCCR
{
    
   private List<Entrant> entrants;
   private SortedMap<String, Double> e1Results;
   private SortedMap<String, Double> e2Results;
   private SortedMap<String, Double> e3Results;
   
   
   /**
    * Constructor for objects of class WCCR
    */
   public WCCR()
   {
      entrants = new ArrayList<Entrant>();
      e1Results = new TreeMap<>();
      e2Results = new TreeMap<>();
      e3Results = new TreeMap<>();
      
       
   } 
 
   /**
    * Method will prompt the user to select the appropiate text file
    * Scanner will read the the file line by line
    * once each line is read all detsils are then added to a new Object
    * 
    */
   public void readInEntrants()
   {
      String pathname = OUFileChooser.getFilename();
      File aFile = new File(pathname);
      Scanner bufferedScanner = null;
      
      try
      {
         String entrantName;
         String entrantCategory;
         Scanner lineScanner;
         String currentLine;
         bufferedScanner = new Scanner(new BufferedReader(new FileReader(aFile)));
         
         
        while(bufferedScanner.hasNextLine())
         {
           
            currentLine = bufferedScanner.nextLine();
            lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            entrantName = lineScanner.next();
            entrantCategory = lineScanner.next();
            entrants.add(new Entrant());
            
            
            
            
          
            
         }
       }
      catch (Exception anException)
      {
          System.out.println("Error: " + anException);
      }
      finally
      {
         try
         {
           bufferedScanner.close();
         }
         catch(Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
   }
   
   /**
    * Method returns a random double value between 30.00 (inclusive) and 60.00 (exclusive).
    */
   private double generateTime()
   {
     Random r = new Random();
     return 30.00 + (60.00 - 30.00) * r.nextDouble();
      
   }
   
    /**
    *  method iterate over entrants, 
    *  and for each entrant generate a random number between 
    *  30.00 (inclusive) and 60.00 (exclusive). 
    */
   public void runRally()
   {
       for (Entrant eachTime : entrants)
      {
        
        System.out.println(generateTime());
        
      }  
      
   }  

    /**
    * The method should sort the receiver’s entrants list by the time each entrant 
    * has taken to complete the rally.
    */
   public void sortEntrantList()
   {
      for (Entrant eachTime : entrants)
      {
         Collections.sort(entrants);
         
      }  
   }
   
    /**
    * This method should iterate over entrants, populating the maps e1Results, e2Results and e3Results, 
    * with the correct names and times of entrants.
    */
   public void categorise()
   {
      Map<String, Set<Double>> e1Results = new HashMap<>();
      Map<String, Set<Double>> e2Results = new HashMap<>();
      Map<String, Set<Double>> e3Results = new HashMap<>();
     for(Entrant cat: entrants)
      {
         if (entrants.contains("E1"))
         {
            e1Results = new HashMap<>();
            
         } else if (entrants.contains("E2"))
         {
            e2Results = new HashMap<>();
         
         } else if (entrants.contains("E3"))
         {
            e3Results = new HashMap<>();
         }
         
      }
   }
 
}
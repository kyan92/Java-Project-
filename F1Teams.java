import java.util.*;
/**
 * the official formula One organization keeps a record of teams who 
 * have entered the new season using an unsorted map, 
 * where each key is a unique String, representing the 
 * name of team and the values are Sets of Strings, 
 * where each String in this set represents the drivers who are currently employed by the team.
 * 
 * @author (Kyan Keise) 
 * @version (23/04/2019)
 */
public class F1Teams
{
   // instance variables 
    Map<String, Set<String>> teams = new HashMap<>();
    

   /**
    * Constructor for objects of class F1Circuits
    */
   public F1Teams()
    {
      
      teams = new HashMap<>();
    }

   /**
    * Tests the map of my chosen scenario 
    */
   public void populateMap()
    {
     Map<String, Set<String>> teams = new HashMap<>();
    Set<String> drivers = new HashSet<>();
     
     drivers.add("Valteri Bottas");
     drivers.add("Lewis Hamilton");
     teams.put("Mercedes",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Sebastian Vettel");
     drivers.add("Charles Leclerc ");
     teams.put("Ferrari",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Max Verstappen");
     drivers.add("Pierre Gasly ");
     teams.put("Red Bull",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Daniel Ricciardo");
     drivers.add("Nico Hulkenberg ");
     teams.put("Renault",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Carlos Sainz");
     drivers.add("Lando Norris");
     teams.put("McLaren",drivers);
     
     
     drivers = new HashSet<>();
     drivers.add("Kimi Raikkonen");
     drivers.add("Antonio Giovinazzi");
     teams.put("Alfa Romeo",drivers);
     
     for(String eachDriver: teams.keySet())
    {
        drivers = teams.get(eachDriver);
        System.out.println("The racing team" + "\t" + eachDriver + "\t" + "are represented by" + drivers);  
   
    }
     
     
    }
   
   
    /**
    * Iterates over all the maps keys prints out a textual represntation of each key with its
    * associated value
    */
   
   public void printMap()
    {
    Map<String, Set<String>> teams = new HashMap<>();
    Set<String> drivers = new HashSet<>();
     
     drivers.add("Valteri Bottas");
     drivers.add("Lewis Hamilton");
     teams.put("Mercedes",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Sebastian Vettel");
     drivers.add("Charles Leclerc ");
     teams.put("Ferrari",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Max Verstappen");
     drivers.add("Pierre Gasly ");
     teams.put("Red Bull",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Daniel Ricciardo");
     drivers.add("Nico Hulkenberg ");
     teams.put("Renault",drivers);
     
     drivers = new HashSet<>();
     drivers.add("Carlos Sainz");
     drivers.add("Lando Norris");
     teams.put("McLaren",drivers);
     
     
     drivers = new HashSet<>();
     drivers.add("Kimi Raikkonen");
     drivers.add("Antonio Giovinazzi");
     teams.put("Alfa Romeo",drivers);
     
     for(String eachTeam : teams.keySet())
    {
        drivers = teams.get(eachTeam);
        System.out.println(eachTeam + drivers);
    }
    }
   
    /**
    * prints a textual representation of its associated value
    * prints output which confirms key is not available
    */
   public void printMapValue(String team)
    {
       if (teams.containsKey(team))
         {
            System.out.println( team + " have employeed: " + teams.get(team)); 
         }
         else
         {
            System.out.println("No record found of a driver racing for" + team);
         }
    }
   
    /**
    * Adds Key and the value to existing map
    */
   public void addMapEntry(String team, String driver )
   
    {
      if(teams.containsKey(team))
      {
         teams.get(team).add(driver);
      }
      else
      {
         Set<String> newValue = new HashSet<>();
         newValue.add(driver);
         teams.put(team,newValue);
      }
    }
   
   /**
    * Returns a new map including entries that satisfy a particular selection criteria
    */
   public Map<String, Set<String>> createReducedMap(String newMap)
    {
     Map <String, Set<String>> resizeMap = new HashMap<>();
     Set<String> valueSet = new HashSet<>();
     for (String aTeam : resizeMap.keySet())
      {
         valueSet = teams.get(aTeam);
         if (valueSet.contains(newMap))
         {
            resizeMap.put(aTeam, valueSet);
         }
 
       }
       return resizeMap;
 
    }
   
   
   /**
    * Removes a particualr element from the collection of elements for a particiular key
    */
   public void deleteFromValue(String aTeam, String aDriver)
    {
      teams.get(aTeam).remove(aDriver);
    }
   
   
   /**
    * removes the key - value pair from the map
    */
   public boolean deleteEntry(String removeTeam)
    {
      boolean existingKey = false;
      if (teams.containsKey(removeTeam))
         {
            teams.remove(removeTeam);
            existingKey = true;
            return existingKey;
         }
         else
         {
            return existingKey;
         }
    }
   
}

import java.util.*;

/**
 * class LeagueAdmin for TMA03Q2.
 * 
 * @author (M250 module team) 
 * @version (1.0)
 */
public class LeagueAdmin {
   // Instance variable
    private Map<String, List<Team>> teams;
    
    
    /**
    * Constructor for objects of class Team
    */
   
   public LeagueAdmin()
    {
       teams = new HashMap<String, List<Team>>();
       
    }

     /**
    * Adds a new team to the division 
    * checks whether team already exists in the divison
    * 
    */
   
   public void addTeam(String division, Team team)
   {
      if (teams.containsKey(division))
      {
         teams.get(division).add(team);
      }
      else
      {
         List<Team> newValue = new ArrayList<Team>();
         newValue.add(team);
         teams.put(division, newValue);
      }
   }
    
    /**
    * records the results when two teams within a division face each other
    * records the goals scored
    */
   
   public void recordResult(String division, String teamA, String teamB, int teamAScore, int teamBScore)
   {

      Team teamAName = null;
      Team teamBName = null;

     List<Team> teamList = teams.get(division);
     for(Team team : teamList) 
     {
         if(teamA.equals(team.getName()))
         {
             teamAName = team;
         } else if (teamB.equals(team.getName())) 
         {
             teamBName = team;
         }
     }


      if (teamAScore == teamBScore)
      {
           teamAName.incDrew();
           teamBName.incDrew();
      } 
      else if (teamAScore > teamBScore) 
      {
           teamAName.incWon();
           teamBName.incLost();
      } 
      else 
      {
          teamAName.incLost();
          teamBName.incWon();
      }
      
     
   }
   
    /**
    * Prints out a all the teams results within each division
    */
   public void printOutTable(String theDivision)
   {
          String results = String.format("%-20s", theDivision );
        
          if (teams.containsKey(theDivision))
          {
            System.out.println( results + teams.get(theDivision));
            
          }
         
   }
         
  }
          
 
         
         
     
   

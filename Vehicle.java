
/**
 * Write a description of class Vehicle here.
 * 
 * @author (Kyan Keise) 
 * @version (21/01/2019)
 */
public class Vehicle
{
   // instance variables - replace the example below with your own
   public RacingDriver racingDriver; 
   private String racingTeam;
   private String chassisNumber; 

   /**
    * Constructor for objects of class Vehicle
    * allows input of all the required values
    */
   public Vehicle(RacingDriver theRacingDriver, String aRacingTeam, String aChassisNumber)
   {
      this.racingDriver = theRacingDriver;
      this.racingTeam = aRacingTeam;
      this.chassisNumber = aChassisNumber;
   }
   
      /**
    * Constructor for objects of class Vehicle
    * will be called when we only know the name of the racing team
    * this will be the minimum requirement before we can construct the object
    */
   public Vehicle( String aRacingTeam)
   {
      this.racingDriver = new RacingDriver();
      this.racingTeam = aRacingTeam;
      this.chassisNumber = null;
   }
   
   /**
    * Getter method returns the name of the racing team
    */ 
   public String getRacingTeam()
   {
    return this.racingTeam;
   }
   
    /**
    * Getter method returns the chassis number of the racing vehicle
    */
   public String getChassisNumber()
   {
    return this.chassisNumber;
   }
   
   /**
    * Getter method returns the chassis number of the racing vehicle
    * if no name has been allocated the program will confirm else the name of the racing driver will
    * be returned
    */
   public String getDriverName()
   {
      if(this.racingDriver == null || this.racingDriver.getName() == null)
      {
         return "No name has been allocated";
      }
      else
      {
         return this.racingDriver.getName();
      }
   }
   
   /**
    * Setter method sets the name of the driver 
    * the name is an attribute to the component RacingDriver
    */
     public void setDriverName(String driverName)
   {
      if(this.racingDriver == null)
      {
         this.racingDriver = new RacingDriver(driverName);
      }
      else
      {
         this.racingDriver.setName(driverName);
      }
   }
   
   /**
    * setter method sets the name of the racing team
    */
   public void setRacingTeam(String aConstructor)
   {
      this.racingTeam = aConstructor;
   }
   
   /**
    * setter method sets the chassis of the racing car which determines the model of thet racing car
    */
   public void setChassisNumber(String selectModel)
   {
      this.chassisNumber = selectModel;
   }
   
    /**
    * Getter method which determines which driver has won depending on the number of wins they have
    * if the number of wins is equal to 12 true will return which determines the winner
    * otherwise false will return
    */
   public boolean driversChampion()
   {
    return this.racingDriver.getWins() == 12;
   
   }
   
   /**
    * Returns string describing the object
    */
   public String toString()
   {
    return this.racingDriver + "He has" + this.racingDriver.getWins() + "wins \n" + " This racing team is called "  + this.racingTeam + "," + "and the chassis number of the vehicle is" + this.chassisNumber
    ;
   }
   
}

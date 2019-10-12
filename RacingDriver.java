
/**
 * This class is based on a professional formula 1 driver.
 * the instance variables represent the drivers name, his official racing number
 * and the number of wins he has in his career
 * 
 * @author (Kyan Keise TMA Q2) 
 * @version (21/01/2019)
 */
public class RacingDriver
{
   // instance variables - replace the example below with your own
   private String name;
   private String number;
   private int wins;

   /**
    * Constructor for objects of class RacingDriver
    */
   public RacingDriver()
   {
      
      this.name = null; // if name of the driver is unknown
      this.number = null;// if racing drivers number is unknown
      this.wins= 0;
   }
   
   /**
    * Constructor for objects of class RacingDriver
    */
   public RacingDriver(String aName)
   {
      
      this.name = aName; 
      this.number = null; // if racing drivers number is unknown
      this.wins = 0;
   }
   
   /**
    * Constructor for objects of class RacingDriver
    */
   public RacingDriver(String aName,String aNumber)
   {
      
      this.name = aName; 
      this.number = aNumber; 
      this.wins = 0;
   }
   
    /**
    * Constructor for objects of class RacingDriver
    */
   public RacingDriver(String aName,String aNumber, int aWin)
   {
      
      this.name = aName; 
      this.number = aNumber; 
      this.wins = aWin;
   }
   
   /**
    * Getter method returns drivers name
    */
   public String getName()
   {
    return this.name;
   }
   
   /**
    * Getter method returns drivers name
    */
   public String getNumber()
   {
    return this.number;
   }
   
   /**
    * getter method sets the drivers name
    */
   public int getWins()
   {
    return this.wins;
   }
   
   /**
    * Setter method sets the drivers official racing number
    */
   public void setNumber(String aNumber)
   {
    this.number = aNumber;
   }
   
   /**
    * Setter method sets the drivers name
    */
   public void setName(String aName)
   {
    this.name = aName;
   }
   
   /**
    * Setter method sets the drivers name
    */
   public void setWins(int numberOfWins)
   {
    this.wins = numberOfWins;
   }
   
   public String toString()
   {
    return "Driver is called" + this.name + "His official racing number is" + this.number;
   }
   
}

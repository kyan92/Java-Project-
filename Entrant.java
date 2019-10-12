
/**
 * Class Entrant - Simulates an entrant in Walton Classic Car Race.
 * 
 * @author M250 Course Team 
 * @version Version 1.0
 */
public class Entrant implements Comparable<Entrant>
{
      private static int nextNumber = 1; // static instance variable

   /* instance variables */

   private int number;       // entrant's number
   private String name;      // entrant's name
   private String category;  // "E1", "E2" or "E3"
   private double time;  // entrant's marathon time in seconds


   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant()
   {
      super();
      name = "";
      category = "";
      time = 0.0;
      this.number = nextNumber ++;

   }
   
   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant(String aName, String aCat)
   {
      super();
      name = aName;
      category = aCat;
      time = 0.0;
      this.number = nextNumber ++;

   }
   
   
   //Only those getter and setter methods that you will need have been included

   /**
    * getter for number
    */
   public int getNumber()
   {
      return number;
   }

   /**
    * getter for name
    */
   public String getName()
   {
      return name;
   }

   /**
    * setter for name
    */
   public void setName(String aName)
   {
      name = aName;
   }

   /**
    * getter for category
    */
   public String getCategory()
   {
      return category;
   }

   /**
    * setter for category
    */
   public void setCategory(String carType)
   {
      category = carType;
   }

   /**
    * getter for time
    */
   public double getTime()
   {
      return time;
   }  

   /**
    * setter for time
    */
   public void setTime(double aTime)
   {
      time = aTime;
   }
   
   /**
    * method will need to compare the time instance variables of the receiver
    * and the method's argument and return an int.
    */
   public int compareTo(Entrant anotherEntrant)
   {
      return Double.compare(getTime(), anotherEntrant.getTime());
     
   } 
 
   


}

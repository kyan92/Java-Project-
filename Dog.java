
/**
 * 
 * TMA02 Q3
 * @author (Kyan Keise D150719) 
 * @version (20/01/2019)
 */
public class Dog 

{
   // instance variables - replace the example below with your own
   private int happiness;
   private int timesFedToday;

   /**
    * Constructor for objects of class Dog
    */
   public Dog(String aName, String aDescription)
   {
      super();
      happiness = 2;
      
   }

   /**
     getter method returns the value of happiness
    */
   public int getHappiness()
   {
      return this.happiness;
   }
   
   
   /**
     getter method returns the value of timesFedToday
    */
   public int getTimesFedToday()
   {
      return this.timesFedToday;
   }
   
   
   /**
     decrements the value of timesFedToday by 1 down to a minimum of 0
    */
   public int decrementTimesFedToday()
   {
      if(getTimesFedToday() <= 0)
      {
       
         return getTimesFedToday();
      }
      else 
      {
         return getTimesFedToday() - 1;
     }
   }
   
   /**
     decrements the value of happiness by 1 down to a minimum of 0
    */
   public int decrementHappiness()
   {  if(getHappiness() <= 0) 
      {
         return getTimesFedToday();
      }
      else
      {
         return this.getHappiness() -1;
      }
   }
   
   /**
     increases the value of happiness by 1
    */ 
   public int incrementHappiness() 
   {
    return this.getHappiness() + 1;
   }
   
   /**
     Increases the value of timesFedToday by 1
    */
   
   public int incrementTimesFedToday()
   {
    return this.getTimesFedToday() + 1;
   }
   
   /**
     when the dog walks its happiness will increase and he will also become hungry due tot he amout of
     energy utilised
    */
   public void walkies()
   {
      while(getTimesFedToday() > 0 )
      {
       System.out.println("I'm going for a walk!");
       this.incrementHappiness();
       System.out.println("I'm getting hungry");
       this.decrementTimesFedToday();
      }
   
   }
   
   /**
     when the dog sleeps hes able to sleep as hes been feed this will increase his happiness. if not 
     the dog wont be happy nor will he be able to sleep
    */
   public boolean sleep()
   {
      boolean happy = true; 
      if (getTimesFedToday() > 0 && getHappiness() > 0 )
      {
      return happy;
      }
      else if (getTimesFedToday() == 0 || getHappiness() == 0 )
      {
         System.out.println("Not happy, can’t sleep" );
      }
     return false;
   }
   
   public void noWalkies() 
   {
      System.out.println("No walkies :-(" + decrementHappiness());
   }
   
   
}

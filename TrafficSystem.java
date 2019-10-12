import ou.*;
/**
 * TrafficSystem for TMA03Q1.
 * 
 * @author (M250 module team) 
 * @version (1.0)
 */
public class TrafficSystem
{
   // given instance variables for the four lights
   private TrafficLight north;
   private TrafficLight south;
   private TrafficLight east;
   private TrafficLight west;
   private int state; // determines the cycling state of the traffic lights
   private boolean go;
   
   
     /**
    * Constructor for objects of class TrafficLight
    */
   public TrafficSystem(TrafficLight aTrafficLightN, TrafficLight aTrafficLightS, TrafficLight aTrafficLightE, TrafficLight aTrafficLightW )
   {
    
    north = aTrafficLightN;
    south = aTrafficLightS;
    east = aTrafficLightE;
    west = aTrafficLightW;
    setPositions();
    state = 0;
    colourAllLights();
    go = false;
   
   }

   

   private void setPositions() // provided method
   {
      north.setXPos(100);
      north.setYPos(0);
      south.setXPos(100);
      south.setYPos(200);      
      west.setXPos(0);
      west.setYPos(100);      
      east.setXPos(200);
      east.setYPos(100);
   }

   /**
    * Provided method without try catch or the checking for 0-4 state.
    * Extra functionality is to be added to deal with non-integer 
    * or out of range inputs
    */
   public void manualOverride()
   {
         int newState = Integer.parseInt(OUDialog.request("Please give the state you want to change to - between 0 and 4 inclusive"));
         try
         {
                if (!go)
             {
                state = newState;
                colourAllLights();
             }
            
             
         }
         catch ( NumberFormatException anException)
         {
             OUDialog.alert("Entered string could not be converted to an integer");
         } 
   }

   /**
    * causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
   
   
   /**
    * Sets the colour of the specified traafic light
    * 
    */
   public void colourLight(TrafficLight aLight, OUColour aColour)
   {
      aLight.setColour(aColour);
   }
   
   /**
    * cycles the value state from 1 -4 then back to 1 again
    * 
    */
   private void cycleState() 
   {
      state = state + 1;
      if(state == 5)
      {
        state = 1;
      }
      
   }
   
   /**
    * Determines the colour if the lights depending on the state
    * 
    */
   private void colourAllLights()
   {
      if(state == 0)
         { 
         north.setColour(OUColour.RED);
         south.setColour(OUColour.RED);
         east.setColour(OUColour.RED);
         west.setColour(OUColour.RED);
        }
      if(state == 1)
      {
         north.setColour(OUColour.GREEN);
         south.setColour(OUColour.GREEN);
         east.setColour(OUColour.RED);
         west.setColour(OUColour.RED);
      }
      if(state == 2)
      {
         north.setColour(OUColour.ORANGE);
         south.setColour(OUColour.ORANGE);
         east.setColour(OUColour.RED);
         west.setColour(OUColour.RED);
      
      }
       if(state == 3)
      {
         north.setColour(OUColour.RED);
         south.setColour(OUColour.RED);
         east.setColour(OUColour.GREEN);
         west.setColour(OUColour.GREEN);
      
      }
       if(state == 4)
      {
         north.setColour(OUColour.RED);
         south.setColour(OUColour.RED);
         east.setColour(OUColour.ORANGE);
         west.setColour(OUColour.ORANGE);
      
      }
    } 
      
   public void setGo(boolean aGo)
   {
        go = aGo;
   }
      
   public void runLights()
   {
         while(true)
         {
            cycleState();
            colourAllLights();
            delay(2000);
         }
         
   }
   
}

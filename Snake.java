import ou.*;
/**
 * partial class Snake - TMA02 Q1.
 * 
 * @author (M250 module team) 
 * @version (1.0)
 */
public class Snake
{
   private Circle head; // provided
   private Circle body;
   private Circle tail;

   /**
    * Constructor for objects of class Snake
    */
   public Snake(int startX, int startY, Circle aHead, Circle aBody, Circle aTail)
   {
      // initialise instance variables
      this.head = aHead; // provided
      this.head.setXPos(startX); // provided
      this.head.setYPos(startY); // provided
      this.head.setDiameter(10); // provided
      
      this.body = aBody;
      this.body.setXPos(startX);
      this.body.setYPos(startY);
      this.body.setDiameter(8);
      
      this.tail = aTail;
      this.tail.setXPos(startX);
      this.tail.setYPos(startY);
      this.tail.setDiameter(6);

   }

   /**
    * sets the colour of head, body and tail all to the argument colour.
    */
   private void setColour(OUColour colour)
   {
      this.head.setColour(colour);
      this.body.setColour(colour);
      this.tail.setColour(colour);

   }

   /**
    * helper method to return x position of head
    */
   private int getHeadXPos() // provided
   {
      return this.head.getXPos();
   }
   
     /**
    * helper method to return y position of head
    */
   private int getHeadYPos() 
   {
      return this.head.getYPos();
   }
   
     /**
    * helper method to return x position of the body
    */
   private int getBodyXPos() 
   {
      return this.body.getXPos();
   }
   
    /**
    * helper method to return y position of the body
    */
   private int getBodyYPos() 
   {
      return this.body.getYPos();
   }

   /**
    * helper method to return x position of tail
    */
   private int getTailXPos() 
   {
      return this.tail.getXPos();
   }
   
   /**
    * helper method to return y position of tail
    */
   private int getTailYPos() 
   {
      return this.tail.getYPos();
   }
   
   
   /**
    * provided
    * return true if the argument represents a valid x-position for a head
    */
   private boolean checkX(int anXPos) // check room to make move
   {
      if ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter()))) // constants only happen in Unit 7
      {
         return true;
      }
      else
      {
         return false;
      }
      //alternative one-line version
      // return ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter())));
   }
   
   /**
    * provided
    * return true if the argument represents a valid y-position for a head
    */
   private boolean checkY(int aYPos) // check room to make move
   {
      if ((aYPos >= 0) && (aYPos <= (350 - head.getDiameter()))) 
      {
         return true;
      }
      else
      {
         return false;
      }
      
   }

   /**
    * provided, but won't compile til earlier parts are completed.
    * once you have completed the methods you are asked to write in
    * parts c and d you can uncomment the body of the method.
    * 
    * if the new position is valid, move the snake so that its head is in the given position
    * move the body to where the head was, and the tail to where the body was.
    * Delay after each move.
    * otherwise
    * leave position unchanged
    * output appropriate message
    */
   private void moveTo(int newHeadX, int newHeadY) 
   {
      int oldHeadX = getHeadXPos(); 
      int oldHeadY = getHeadYPos();
      int oldBodyX = getBodyXPos();       
      int oldBodyY = getBodyYPos();
      if (checkX(newHeadX) && checkY(newHeadY))
      {
         this.head.setXPos(newHeadX);
         this.head.setYPos(newHeadY);          
         this.delay(100);
         this.body.setXPos(oldHeadX);
         this.body.setYPos(oldHeadY);
         this.delay(100);            
         this.tail.setXPos(oldBodyX);
         this.tail.setYPos(oldBodyY);
         this.delay(100);            
       }
      else
      {
          System.out.println("Snake cannot cross boundary!");
      }      
   }

   /**
    * Moves the snake to the right
    */
   public void right()
   {
    moveTo(this.getHeadXPos() + 10,10);

   }
   

   /**
    * Moves the snake to the left
    */
   public void left()
   {
    moveTo(this.getHeadXPos() - 10,10);
    
   }
   
   
   /**
    * Moves the snake up
    */ 
   public void up()
   {
    moveTo(0,this.getHeadYPos() - 10);
   }
   
   /**
    * Moves the snake down
    */
   public void down()
   {
     moveTo(0,this.getHeadYPos() +10);
   }
   
   /**
    * whilst the snake carries out 100 random steps the snake will either move left right up of down
    */
   
   public void randomWalk()
   {
    int walks = randomInteger();
      
        while (walks <= 100)
      {
      if(walks == 1)
      {
         right();
       
      }
      if(walks == 2)
      {
         left();
         
      }
      if(walks == 3)
      {
        up();
        
      }
      if(walks == 4)
      {
         down();
         
      }
   }
   }
   
    /**
    * Moves the snake horizontally one step at A time until the x position of the head is within 
    * 1 head diameter of 125, then vertically until the y pos of the head is within 1 head diameter 
    * of 175.
    */
   public void home()
   {
      int xPosition = this.getHeadXPos();
      int yPosition = this.getHeadYPos();
      
    
    while( xPosition <= 134)
    {
      this.right();
      }
    while(xPosition >= 116 )
    {
      this.down();
      
    }
     while(yPosition < 184 )
    {
      this.down();
      
    }
      }
   
   /**
    * provided
    * Causes execution to pause by time number of milliseconds
    * You can use this method without needing to understand how it works
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
    * provided
    * return a random integer between 1 and 4 inclusive
    * You can use this method without needing to understand how it works
    */
   public int randomInteger() 
   {
      java.util.Random r = new java.util.Random();
      return r.nextInt(4) + 1;
   }

}


/**
 * Answer to TMA01 Question 1
 * 
 * @author (Kyan Keise) 
 * @version (12/12/2018)
 */
public class Roomsafe
{
   // instance variables 
   private String password;

   /**
    * Constructor for objects of class Roomsafe
    */
   public Roomsafe()
   {
      // initialise instance variables
      password =  "Adminadmin1";
   }
   
   
   public String getPassword()
   {
    return password;
   
   }
   
   public boolean isValidLength(String pw)
   {
      // Assume initially that the String is not more then 8 characters long.
      boolean result = false;
      // if the character length is equal to or more then 8 
      // set result to true
      if( pw.length() >= 8) {
      result = true;
   }
   else {
   result = false;
   }
   return result;

}


 public boolean hasDigit(String pw)
   {    // Assume initially that the string contains no digits.
        boolean result = false;
        // Examine each character of pw in turn.
        for (int i = 0; i < pw.length(); i++)
        {
           // If the character at position i is a digit, 
           // set result to true
           if (Character.isDigit(pw.charAt(i)))
           {
             result = true;
           }
        }
        return result;
   }

    public boolean hasUpperCase(String pw) 
    { // Assume initially that the string contains no uppercase char.
       boolean result = false;
       
       for(int i = 0; i < pw.length(); i++)
       {
          // If the password at position i is uppercase, 
           // set result to true
         if (Character.isUpperCase(pw.charAt(i)))
         {
          result = true;
         }

    }
    
   return result;

}


public boolean isValidPassword(String pw)
 { 
 boolean result = false;
  if (hasUpperCase(pw) && hasDigit(pw) && isValidLength(pw)) 
  {
    result = true;
  }
 else {

 result = false;
  } 
 return result;
}
 


public void setPassword(String pw) 
{
  
  if(isValidPassword(pw)) {
   System.out.println("This password"  +  pw +  " is valid" ); 
   this.password = pw;
   }
   else {
   System.out.println("This password"  +  pw  +  "is not valid");
   }
}

public boolean hasChanged() 
{

   boolean result = false;
   String oldPassword = "Adminadmin1";

   {
   if (password == oldPassword)
   {
      result = false;
   }
   else 
   {
      result = true;
   }
   


  }
   return result;
}

}



   


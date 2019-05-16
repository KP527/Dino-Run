/*****************************************************************
   * A Cactus is an extension of the abstract class Obstacle who's only
   * new field in myNumber which is the number of cacti in a group at a
   * given time. Everything else is called from the Obstacle class. It knows
   * how to move across the display.
   ****************************************************************/
public class Cactus extends obstacle
{
   private int myNumber;
  
   /**************************************************************
    * Constructs a catus with the fields myX, myY, myHeight, myLength
    * from the super
    **************************************************************/
  
   public Cactus()
   {
      super();
   }
   /**************************************************************
    * Constructs a catus with the fields myX, myY, myHeight, myLength
    * from the super and it sets myNumber
    **************************************************************/
   public Cactus(int x)
   {
      super();
      myNumber=x;
   }
   /**************************************************************
    * Returns the number of cacti in the bunch
    **************************************************************/
  
   public int getNumber()
   {
      return myNumber;
   }
    /**************************************************************
    * Sets the number of cacti in the bunch
    **************************************************************/
  
   public void setNumber(int x)
   {
      myNumber = x;
   }
   
   public void setY(int y)
   {
      myY = y;
   }

 }



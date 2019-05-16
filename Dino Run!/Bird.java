public class Bird extends obstacle
{
  
    
    private int myX, myY, myHeight, myLength;
    
    /**************************************************************
    * Constructs a bird with the fields myX, myY, myHeight, myLength
    * from the super
    **************************************************************/
  
   public Bird()
   {
      super();
   }
    /**************************************************************
    * Constructs a bird with the fields myX, myY, myHeight, myLength
    * from the super 
    **************************************************************/
   public Bird(int x, int y, int h, int l, int s)
   {
     super(int x, int y, int h, int l, int s);
   }
    /**************************************************************
    * Sets the hight of where the bird flies
    **************************************************************/  
   public void setY( int y )
   {
      myY = y;
   }

}



	/*****************************************************************
	* An obstacle is a class that maintains information about its X position, Y position, height and length. An obstacle
	* knows how to return and set its private fields and can be displayed in a panel.	 
	* @author priya
	* @version 0.0.1
	****************************************************************/
public abstract class Obstacle
{
    private int myX, myY, myHeight, myLength, mySpeed;
   
      /************************************************************* 
   	* Constructs an obstacle with X, Y, height and length set to 0.
   	**************************************************************/
    public Obstacle()
    {
      myX = 0;
      myY = 40;
      myHeight = 40 //imageheight;
      myLength = 20 //imagelength;
      mySpeed = 5;
    }
    
    public Obstacle(int x, int y, int h, int l, int s)
    {
      myX = x;
      myY = y;
      myHeight = h;
      myLength = l;
      mySpeed = s;
    }

    
    //accessor methods to be able to tell where obstacle is
    
    /*************************************************************** 
   	* Returns the obstacle's X position
   	* @return	 X position
   	**************************************************************/
    public int getX()
    {
      return myX;
    }
    /*************************************************************** 
   	* Returns the obstacle's Y position
   	* @return	 Y position
   	**************************************************************/
    public int getY()
    {
       return myY;
    }
    /*************************************************************** 
   	* Returns the obstacle's height
   	* @return	 Height
   	**************************************************************/
    public int getHeight()
    {
      return myHeight;
    }
    /*************************************************************** 
   	* Returns the obstacle's length
   	* @return	 length
   	**************************************************************/
    public int getLength()
    {
      return myLength;
    }
    
    /*************************************************************** 
   	* Returns the obstacle's speed
   	* @return	 speed
   	**************************************************************/
    
    public int getSpeed();
    {
      return mySpeed;
    }

    //modifier methods
    /***************************************************************
   	* Sets the obstacle's x position.
   	* @return	 area
   	**************************************************************/
    public void setX( int x )
    {
    myX = x;
    }
    
    /***************************************************************
   	* Sets the obstacle's Y value.
      * @param x	 assigns x to myX
   	**************************************************************/

    public abstract void setY( int y );
    
    /***************************************************************
   	* Sets the obstacle's height.
      * @param x	 assigns h to myHeight
   	**************************************************************/

    public void setHeight( int h )
    {
    myHeight = h;
    }
    /***************************************************************
   	* Sets the obstacle's length.
      * @param x	 assigns l to myLength
   	**************************************************************/
    public void setLength( int l )
    {
    myLength = l;
    }
     /***************************************************************
   	* Sets the obstacle's speed.
      * @param x	 assigns s to mySpeed
   	**************************************************************/
    public void setSpeed( int s )
    {
    mySpeed = s;
    }

    
       //display

    /***************************************************************
   * moves the obstacle to the left.
   **************************************************************/
    public void move()
    {
    setX(myX-mySpeed);
    }


}
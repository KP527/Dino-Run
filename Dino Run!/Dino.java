
/*****************************************************************

    * A Dino is a character that maintains information about its height, width, speed, jump height, and coordinates. A dino

    * knows how to return its height, set its height, return its length, set its length, and the same for the other fields. It also knows how to jump and duck, increasing/decreasing its height.

     

    * @author 

    * @version 

    ****************************************************************/

public class Dino

{

private int myHeight;


private int myWidth;

private int myJump;

private int myX;

private int myY;

/************************************************************* 

       * Constructs a dino with initial height, width, speed, jump height, x, and y.

   

       **************************************************************/   

public Dino(int h, int w, int s, int j, int x, int y)

{

myHeight = h;

myWidth = w;

myJump = j;

myX= x;

myY = y;

}


 /*************************************************************** 

       * Returns the dino's height

   

       **************************************************************/

 public int getHeight()

   {

   return myHeight;

   }

   

 /*************************************************************** 

       * Returns the dino's width

   

       **************************************************************/

   public int getWidth()

   {

   return myWidth;

   }

   

 /*************************************************************** 

       * Returns the dino's jump height

   

       **************************************************************/

   public int getJump()

   {

   return myJump;

   }

   

 /*************************************************************** 

       * Returns the dino's x position

   

       **************************************************************/

   public int getX()

   {

   return myX;

   }

   

 /*************************************************************** 

       * Returns the dino's y position

   

       **************************************************************/

   public int getY()

   {

   return myY;

   }


   /***************************************************************

       * Sets the height to the input number.

  

       **************************************************************/

public void setHeight(int y)

      {

         myHeight = y;

      }

         /***************************************************************

       * Sets the width to the input number.

  

       **************************************************************/

public void setWidth(int y)

      {

         myWidth = y;

      }


   /***************************************************************

       * Sets the jump height to the input number.

  

       **************************************************************/

public void setJump(int y)

      {

         myJump = y;

      }

   /***************************************************************

       * Sets the x positon to the input number.

  

       **************************************************************/

public void setX(int y)

      {

         myX = y;

      }

   /***************************************************************

       * Sets the y positon to the input number.

  

       **************************************************************/

public void setY(int y)

      {

         myY = y;

      }

      /***************************************************************

       * Makes the dino jump 

       

       **************************************************************/

public void jump()

{

// increases height and decreases height

}

    /***************************************************************

       * Makes the dino duck

       

       **************************************************************/

public void duck()

{

//decreases height

}

}




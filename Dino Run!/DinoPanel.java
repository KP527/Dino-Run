   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   
   public class DinoPanel extends JPanel
   {
      private DinoScoreboard scoreboard;
      private DisplayDino display;
      
      public DinoPanel()
      {
         setLayout(new BorderLayout());
      
         scoreboard = new DinoScoreboard();
         add(scoreboard, BorderLayout.NORTH);
      
         display = new DisplayDino();
         add(display, BorderLayout.CENTER);
      
      }
   }

import java.io.*;      //the File class
import java.util.Scanner; //scanner class             --     DO NOT DO JAVA.UTIL.*;
import javax.swing.*; //timer is in this package
import java.awt.*;      //
import java.awt.event.*;  //actionlistener class

   public class DinoScoreboard extends JPanel
   {
      public JLabel HiScore, time;
      String filename = "HighScores.txt";
      public int hi; //highscore
      
      public DinoScoreboard()
      {
      
         setLayout(new GridLayout(1, 2)); //2 rows 1 column
         
         HiScore = new JLabel("0");
         HiScore.setHorizontalAlignment(SwingConstants.RIGHT);
         add(HiScore);
         
         time = new JLabel("0");
         time.setHorizontalAlignment(SwingConstants.RIGHT);
         add(time);
         
         Timer t = new Timer(10, new Listener());
         t.start();
         
         Scanner infile = null;
         
         try
            {
               infile = new Scanner(new File(filename));
            }
         catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be found.");
               System.exit(0);
            }
            
            hi = infile.nextInt();
       
       //the text file should have all high scores.  
       //somehow we have to make int hi always the high score so that when you die it will display it  
       //btw when you die its supposed to display the high score and then your score (time)
       //the part below is only supposed to run if the dino has died but i dont know how to check that in this class, also we need to fix each class's methods
         
       
       PrintStream outfile = null;
         try{
            outfile = new PrintStream(new FileOutputStream(filename));
            }
             catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be created.");
            }
            System.setOut(outfile);
            
            
            if(hi < Integer.parseInt(time.getText()))
               System.out.println(time.getText());

         
       }

    
   private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           time.setText(""+(Integer.parseInt(time.getText())+1));
           
         }
      }
}
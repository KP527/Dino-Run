import javax.swing.JFrame;

public class DinoDriver
{
   public static void main (String[] args)
   {
         JFrame frame = new JFrame("Dino Run!");
         frame.setSize(600, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new DinoPanel());
         frame.setVisible(true);
    }
}
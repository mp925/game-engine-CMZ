package defaultpackage;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {
//	public Main()  {
	public static void main(String[] args) {
	try 
	   {
		   System.out.println("Before");
       add(new LandScape());
	   System.out.println("After");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(400, 300);
       setLocationRelativeTo(null);
       setTitle("This is the Game Boys");
       setResizable(false);
       setVisible(true);
		   System.out.println("After");
	   }
	catch(IllegalArgumentException e)
	{
	  e.getMessage();
	}
    }
}

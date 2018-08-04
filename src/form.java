import java.awt.Color;

import javax.swing.JFrame;


public class form extends JFrame
{
     public form(String title)
     {
    	 this.setTitle(title);
    	 this.setSize(400,300);
    	 this.setBackground(Color.blue);
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
     }
}

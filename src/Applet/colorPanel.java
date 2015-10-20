package Applet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class colorPanel extends JPanel
{
  /*  The width of the text labels is 8 in most cases  */

  JLabel numbers [];
  int rows, cols;
  
  public colorPanel(int rows, Color color)
    {
      super();
      this.rows = rows;
      this.setLayout(new GridLayout(rows,1));
      
      this.setBackground(color);
      
      numbers = new JLabel[rows];
      
      for (int i = 0; i < rows; i++) {
		  numbers[i] = new JLabel("      ");
		  numbers[i].setPreferredSize(new Dimension(60, 20));
		  add(numbers[i]);
      }
    } /* end colorPanel procedure */
} /* end colorPanel class */

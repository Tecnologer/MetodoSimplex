package Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener
{
  SimplexTool outerParent;
  
  JLabel author0;
  JLabel author1;
  JLabel author2;
  JLabel author3;
  JLabel author4;
  JLabel author5;
  JLabel otc;
  JButton ok;
  
  public About(SimplexTool target)
    {
      super("Acerca de...");
      outerParent = target;
	  Container c = getContentPane();
      c.setLayout(new GridLayout(8,3));
      
      ok = new JButton("Aceptar");
	  ok.addActionListener(this);

      author0 = new JLabel("Creado por:", JLabel.CENTER);
      otc = new JLabel("Instituto Tecnologico de Culiacan", JLabel.CENTER);
      author1 = new JLabel("Dominguez Soto Rey David", JLabel.LEFT);
      author2 = new JLabel("Muñoz Gomez Jorge Fidencio", JLabel.LEFT);
      author3 = new JLabel("Ontiveros Saldaña Kaleb", JLabel.LEFT);
      author4 = new JLabel("Corrales Gonzalez Emmanuel", JLabel.LEFT);
      author5 = new JLabel("Marquez Ocampo Sergio", JLabel.LEFT);

      
      c.add(otc);
      c.add(author0);
      c.add(author2);
      c.add(author3);
      c.add(author4);
      c.add(author5);
      c.add(author1);
      c.add(ok);//inserta el boton
      this.pack();
	  
	  //handle window closing event
	  this.addWindowListener(new WindowAdapter() { 
		  public void windowClosing(WindowEvent e) {
			outerParent.about.setEnabled(true);
			dispose();
			System.exit(0);
		  }
		 }
	  );
    } /* end about procedure */
  
  public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == ok) {
		this.hide();
		outerParent.about.setEnabled(true);
	}
  } /* end action procedure */
} /* end About class */
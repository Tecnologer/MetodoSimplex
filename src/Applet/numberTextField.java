package Applet;

import javax.swing.JTextField;

public class numberTextField extends JTextField
{
  private Float tmp;
    
  public numberTextField()
    {
      super(3);
    }
  
  /* this function tests input to see if it is a number.
     It allows for no input to be a Zero */
  
  public boolean isNumber()
    {
      try {
	tmp = new Float(Float.valueOf(this.getText()).floatValue());
      }
      catch (NumberFormatException e) {
	if (this.getText().length() > 0)
	  return false;
	else
	  tmp = new Float(0);
      }
      return true;
    } /* end isNumber procedure */
  
  public float getFloat()
    {
      if(tmp != null) {
	this.isNumber();
	return tmp.floatValue();
      }
      else 
	return tmp.floatValue();
    } /* end getFloat */
} /* end numberTextField class */

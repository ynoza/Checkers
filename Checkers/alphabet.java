import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class alphabet extends Applet implements ActionListener
{
    JTextField text;
    public void init ()
    {
	text = new JTextField (40);
	JButton a[] = new JButton [26];
	Panel g = new Panel (new GridLayout (4, 13));
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton ("" + (char) (i + 97));
	    a [i].setBackground (Color.yellow);
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + (char) (i + 97));
	    g.add (a [i]);
	}
	JButton f = new JButton ("|__|");
	f.setBackground (Color.yellow);
	f.addActionListener (this);
	f.setActionCommand (" ");
	g.add (f);

	for (int i = 0 ; i < 9 ; i++)
	{
	    a [i] = new JButton ("" + (i + 1) + "");
	    a [i].setBackground (Color.yellow);
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + (i + 1) + "");
	    g.add (a [i]);
	}

	add (text);
	add (g);
	resize (500, 135);
    }


    public void actionPerformed (ActionEvent e)
    {
	text.setText (text.getText () + e.getActionCommand ());
    }
}

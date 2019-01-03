import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class dog extends Applet implements ActionListener
{
    int row = 3;
    JButton a[] = new JButton [row * row];
    int i = 0;

    public void init ()
    {
	JLabel title = new JLabel ("Picture Reveal");
	Panel g = new Panel (new GridLayout (row, row));
	for (i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton (" ");
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setPreferredSize (new Dimension (216, 162));
	    g.add (a [i]);
	}
	JLabel inst = new JLabel ("Click on the squares for a question to appear");

	JButton reset = new JButton ("Reset");
	reset.addActionListener (this);
	reset.setActionCommand ("A");

	add (title);
	add (inst);
	add (g);
	add (reset);

	resize (650, 525);
    }


    public void actionPerformed (ActionEvent e)
    {

	if (e.getActionCommand ().equals ("A"))
	{
	    for (int j = 0 ; j < 9 ; j++)
		a [j].setIcon (createImageIcon ("blank.jpg"));
	}

	else
	{
	    int n = Integer.parseInt (e.getActionCommand ());
	    int x = n / row;
	    int y = n % row;
	    showStatus ("(" + x + ", " + y + ")");


	    a [n].setIcon (createImageIcon ("dogs" + (n + 1) + ".jpg"));


	}
    }



    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = dog.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}



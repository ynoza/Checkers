import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class cind extends Applet implements ActionListener
{
    JButton a[] = new JButton [2 * 2];
    JButton b[] = new JButton [1 * 4];
    int i = 0;
    int g = 1;
    int temp = -1;
    int ans[] = {3, 1, 2, 4};

    public void init ()
    {

	JLabel title = new JLabel ("Cinderella Puzzle");

	a [0] = new JButton (createImageIcon ("cinder2.jpg"));
	a [2] = new JButton (createImageIcon ("cinder1.jpg"));
	a [1] = new JButton (createImageIcon ("cinder3.jpg"));
	a [3] = new JButton (createImageIcon ("cinder4.jpg"));

	Panel g = new Panel (new GridLayout (2, 2));
	for (i = 0 ; i < a.length ; i++)
	{
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setPreferredSize (new Dimension (300, 220));
	    g.add (a [i]);
	}

	b [0] = new JButton (createImageIcon ("tn3.jpg"));
	b [2] = new JButton (createImageIcon ("tn2.jpg"));
	b [1] = new JButton (createImageIcon ("tn1.jpg"));
	b [3] = new JButton (createImageIcon ("tn4.jpg"));

	Panel v = new Panel (new GridLayout (1, 4));
	for (i = 0 ; i < b.length ; i++)
	{
	    b [i].addActionListener (this);
	    b [i].setActionCommand ("" + (i));
	    b [i].setPreferredSize (new Dimension (88, 66));
	    v.add (b [i]);
	}

	JLabel inst = new JLabel ("Click on the thumbmail of the picture you want to place. Then click on the square where you wish to place it.");

	JLabel thumb = new JLabel ("Thumbnails");

	JLabel puzzle = new JLabel ("Puzzle");


	add (title);
	add (inst);
	add (thumb);
	add (v);
	add (puzzle);
	add (g);

	resize (650, 525);
    }


    public void actionPerformed (ActionEvent e)
    {
	int n = Integer.parseInt (e.getActionCommand ());

	if (temp == -1)
	    temp = n;
	else
	{
	    a [n].setIcon (createImageIcon ("cinder" + ans [temp] + ".jpg"));
	    temp = -1;
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = cind.class.getResource (path);
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



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;


public class checkers extends Applet implements ActionListener
{
    int row = 8;
    int col = 8;
    int pic[] [] = {{1, 3, 1, 3, 1, 3, 1, 3}, {3, 1, 3, 1, 3, 1, 3, 1}, {1, 3, 1, 3, 1, 3, 1, 3}, {2, 1, 2, 1, 2, 1, 2, 1}, {1, 2, 1, 2, 1, 2, 1, 2}, {4, 1, 4, 1, 4, 1, 4, 1}, {1, 4, 1, 4, 1, 4, 1, 4}, {4, 1, 4, 1, 4, 1, 4, 1}};
    JButton b[] = new JButton [row * col];
    char a = 'l';
    char w = 'z';

    public void init ()
    {

	Panel g = new Panel (new GridLayout (8, 8));
	for (int i = 0 ; i < b.length ; i++)
	{
	    b [i] = new JButton ("");
	    b [i].addActionListener (this);
	    b [i].setActionCommand ("" + i);
	    b [i].setPreferredSize (new Dimension (40, 40));
	    g.add (b [i]);
	}
	add (g);
	resize (330, 330);
	redraw ();

    }


    public void redraw ()
    {
	int move = 0;
	for (int i = 0 ; i < 8 ; i++)
	{
	    for (int j = 0 ; j < 8 ; j++)
	    {
		b [move].setIcon (createImageIcon ("b" + pic [i] [j] + ".jpg"));
		move++;
	    }
	}
    }


    public void actionPerformed (ActionEvent e)
    {
	if (w == 'z')
	{
	    int n = Integer.parseInt (e.getActionCommand ());
	    b [n].setIcon (createImageIcon ("b2.jpg"));
	    w = 'x';
	}
	else
	{

	    int n = Integer.parseInt (e.getActionCommand ());
	    int x = n / row;
	    int y = n % row;
	    showStatus ("(" + x + ", " + y + ")");

	    if (a == 'l')
	    {
		showStatus ("Red turn");
		b [n].setIcon (createImageIcon ("b3.jpg"));
		a = 'w';
	    }
	    else
	    {
		showStatus ("White turn");
		b [n].setIcon (createImageIcon ("b4.jpg"));
		a = 'l';
	    }
	    w = 'z';

	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = checkers.class.getResource (path);
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



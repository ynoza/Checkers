import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class map extends Applet implements ActionListener
{
    JButton[] a;
    int map[] [] = {{0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 2, 2, 2, 1, 0, 1, 1, 1, 0, 0}, {0, 0, 1, 2, 4, 2, 1, 0, 1, 3, 1, 0, 0}, {0, 0, 1, 1, 1, 2, 1, 1, 1, 5, 1, 0, 0}, {0, 0, 0, 1, 1, 2, 6, 4, 2, 5, 1, 0, 0}, {0, 0, 0, 1, 2, 2, 2, 1, 2, 2, 1, 0, 0}, {0, 0, 0, 1, 2, 2, 2, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}};
    int total = 117;
    JButton reset;

    public void init ()
    {
	resize (500, 400);
	Panel p = new Panel (new GridLayout (9, 13));

	a = new JButton [total];
	int l = 0;
	int k = 0;


	for (int i = 0 ; i < 9 ; i++)
	{
	    for (int j = 0 ; j < 13 ; j++)
	    {
		a [i * 13 + j] = new JButton (createImageIcon ("" + map [i] [j] + ".jpg"));
		a [i * 13 + j].setPreferredSize (new Dimension (20, 30));
		p.add (a [i * 13 + j]);

	    }
	}
	add (p);

    }


    public void actionPerformed (ActionEvent e)
    {
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = map.class.getResource (path);
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



import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class kar extends Applet implements ActionListener
{
    int row = 5;
    JButton a[] = new JButton [row * row];
    String b[] [] = {{"s", "n", "s", "s", "s"}, {"s", "n", "n", "s",
	    "s"}, {"s", "n", "s", "s", "n"}, {"n", "n", "s", "n", "s"}, {"n",
	    "s", "s", "n", "s"}};
    int g = 0;
    int p = 0;
    JLabel sed;

    public void init ()
    {
	Panel g = new Panel (new GridLayout (row, row));
	int y = 0;
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < row ; j++)
	    {
		a [y] = new JButton ("");
		a [y].addActionListener (this);
		a [y].setActionCommand ("" + y);
		a [y].setPreferredSize (new Dimension (50, 50));
		g.add (a [y]);
		y++;
	    }
	}
	sed = new JLabel ("");
	add (g);
	add (sed);
	resize (250, 245);
    }


    public void actionPerformed (ActionEvent e)
    {
	int n = Integer.parseInt (e.getActionCommand ());
	int x = n / row;
	int y = n % row;
	showStatus ("(" + x + ", " + y + ")");

	if (b [x] [y] == "s")
	{
	    a [n].setBackground (Color.red);
	    g++;
	}
	else
	{
	    a [n].setBackground (Color.blue);
	    p++;
	}

	if (g > 14)
	{
	    int r = 0;
	    sed.setText ("Game Over. \nYou have " + g + " hits and " + p + " misses.");

	    while (r != 25)
	    {
		a [r].setEnabled (false);
		r++;
	    }
	}
    }
}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;


public class littleredriding extends Applet implements ActionListener
{
    JButton next;
    JLabel text;
    String story[] = new String [11];
    story [0] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.";
    story [1] = "She walkled through the woods and over bridges.";
    story [2] = "After a while, she met a wolf who trickled her into picking flowers for her grandmother.";
    story [3] = "The wolf ran ahead and ate her sick grandmother, then he disguised himself.";
    story [4] = "When red arrived, she was puzzled. SHe said, \"Grandmother, what big ears you have!\".";
    story [5] = "Then, red said, \"Grandmother what sharp teeth you have!\" and the wolf ate her.";
    story [6] = "Full, the wolf went to sleep and snored loudly. A nearby woodcutter heard him.";
    story [7] = "When the woodcutter came to investigate, he noticed a scarf coming out of the wolf's mouth.";
    story [8] = "The scarf was from the grandmother's knitting in the wolf's stomach.";
    story [9] = "The woodcutter pulled Little Red Riding Hood and her grandmother free.";
    story [10] = "The wolf was put in prison and everyone else lived happily ever after. The End.";


    public void init ()
    {

	JLabel title = new JLabel ("Little Red Riding Hood");
	title.setFont (new Font ("Verdana", Font.BOLD, 35));
	title.setForeground (Color.blue);

	JLabel open = new JLabel (createImageIcon ("logo.jpg"));

	next = new JButton ("Next");
	next.setFont (new Font ("Arial", Font.PLAIN, 12));
	next.setForeground (Color.blue);
	next.setBackground (Color.orange);
	next.setActionCommand ("n");
	next.addActionListener (this);

	text = new JLabel ("Here's the Story of Little red riding hood");

	add (title);
	add (open);
	add (next);
	add (text);
    }


    public void actionPerformed (ActionEvent e)
    {
	for (int i = 0 ; i <= story.length - 1 ; i++)
	{
	    open.setText (createImageIcon (i + ".jpg"));
	    text.setText (story [i]);
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = littleredriding.class.getResource (path);
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

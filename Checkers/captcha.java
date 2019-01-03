import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class captcha extends Applet implements ActionListener
{
    String a[] = {"existing", "overlooks", "inquiry", "contribute", "tround", "qssae", "3m573", "chisels", "and"};
    JLabel pic, ins;
    JTextField q;
    JButton next;
    int c = 1;
    int n = 0;

    public void init ()
    {
	JLabel title = new JLabel ("Capcha");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	pic = new JLabel (createImageIcon ("c1.png"));

	JLabel ans = new JLabel ("Answer:");

	q = new JTextField (10);

	JButton done = new JButton ("Done");
	done.addActionListener (this);
	done.setActionCommand ("D");

	next = new JButton ("Next");
	next.addActionListener (this);
	next.setActionCommand ("E");
	next.setEnabled (false);

	ins = new JLabel ("Type in the answer");

	add (title);
	add (pic);
	add (ans);
	add (q);
	add (done);
	add (next);
	add (ins);

	resize (180, 220);
    }


    public void actionPerformed (ActionEvent e)
    {


	if (e.getActionCommand ().equals ("D"))
	{
	    String v = q.getText ();
	    if (a [n].equals (v))
	    {
		ins.setText ("Correct");
		next.setEnabled (true);
	    }

	    else
		ins.setText ("Wrong");
	}
	if (e.getActionCommand ().equals ("E"))
	{
	    c++;
	    if (c == 10)
		c = 1;
	    pic.setIcon (createImageIcon ("c" + c + ".png"));


	    ins.setText ("Type in the answer");
	    q.setText ("");
	    n++;
	    next.setEnabled (false);
	}

	if (n == 9)
	    n = 0;
    }



    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = captcha.class.getResource (path);
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



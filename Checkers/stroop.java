import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;


public class stroop extends Applet implements ActionListener
{
    JLabel text;
    String names[] = {"Black", "Blue", "Cyan", "White", "Red", "Yellow", "Orange", "Pink", "Magenta", "Green"};
    Color colours[] = {Color.black, Color.blue, Color.cyan, Color.white, Color.red, Color.yellow, Color.orange, Color.pink, Color.magenta, Color.green};
    int n = (int) (Math.random () * 9) + 0;
    int n2 = (int) (Math.random () * 9) + 0;
    //JTextField in;


    public void init ()
    {

	resize (300, 150);

	JLabel title = new JLabel ("Call the colour, not the word.");
	title.setFont (new Font ("Verdana", Font.BOLD, 11));

	JButton clue = new JButton ("New Clue");
	clue.setActionCommand ("n");
	clue.addActionListener (this);

	text = new JLabel ("Magenta");
	text.setForeground (Color.green);
	text.setFont (new Font ("Verdana", Font.PLAIN, 50));

	add (title);
	add (text);
	add (clue);
	//add (in);
    }


    public void actionPerformed (ActionEvent e)
    {
	text.setForeground (colours [n]);
	text.setText (names [n2]);
	//String v = in.getText ();
	//if (names [n2] == v)
	//{
	n = (int) (Math.random () * 9) + 0;
	n2 = (int) (Math.random () * 9) + 0;
	//}
    }
}



import java.awt.*;
import java.applet.*;
public class SortAnimator extends Applet
{
    Button select, bubble, insert;
    int size = 10;
    int a[] = new int [20];
    Button reset;


    public void init ()
    {
	for (int i = 0 ; i < 20 ; i++)
	{
	    int x = (int) ((Math.random () * 100) + 1);
	    a [i] = x;
	}

	select = new Button ("selection sort");
	add (select);
	bubble = new Button ("bubble sort");
	add (bubble);
	insert = new Button ("insertion sort");
	add (insert);
	reset = new Button ("Reset array");
	add (reset);
    }


    public void printarray (int a[])
    {
	Graphics g = getGraphics ();
	set the x position to 50
	    for all of the values in the array (i)
	    draw a rectangle that starts at x, 50 and goes the length of that array
		element and down 10 pixels.
		g.fillRect (x, 50, a [i], 10);
	increase x by 10 pixels (width of the bar) and 2 pixels (space between).

    }


    public boolean action (Event e, Object o)
    {
	if (e.target == select)
	{
	}
	else if (e.target == bubble)
	{
	}
	else if (e.target == insert)
	{
	}
	else if (e.target == reset)
	{
	}
	return true;
    }


    public void paint (Graphics g)
    {
	g.setColor (Color.red);
	printarray ();
    }
}

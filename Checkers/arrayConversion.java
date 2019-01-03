public class arrayConversion
{
    public static void main (String args[])
    {
	new arrayConversion ();
    }


    public arrayConversion ()
    {
	String array[] = {"1", "2", "3", "4", "5", "6","7"};
	System.out.println ("Printing out the array");
	for (int i = 0 ; i < array.length ; i++)
	    System.out.print (array [i] + " ");
	System.out.println ();
	System.out.println ("The Minimum");
	String min = array [0];
	for (int i = 1 ; i < array.length ; i++)
	{
	    if (array [i].compareTo(min)<0)
		min = array [i];
	}
	System.out.println ("The minimum value is " + min);
	System.out.println ("The Maximum");
	String max = array [0];
	for (int i = 1 ; i < array.length ; i++)
	{
	    if (array [i].compareTo (max)>0)
		max = array [i];
	}
	System.out.println ("The maximum value is " + max);
	System.out.println ("The Sum");
	String s = "0";
	for (int i = 0 ; i < array.length ; i++)
	{
	    s += array [i];
	}
	System.out.println ("The sum is " + s);
	System.out.println ("The Average");
	String av = "0";
	for (int i = 0 ; i < array.length ; i++)
	{
	    av += array [i];
	}
	int w = Integer.parseInt (av);
	System.out.println ("The average is " + (w / array.length));
	System.out.println ("Linear Search");
	String findMe = IBIO.inputString ("What do you want to find in the array? ");
	int pos = -1;
	for (int i = 0 ; i < array.length ; i++)
	{
	    if (array [i].equals(findMe))
		pos = i;
	}
	if (pos == -1)
	    System.out.println ("The value is not in the array");
	else
	    System.out.println ("The value is at position " + pos);
    }
}

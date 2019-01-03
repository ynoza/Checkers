public class moviePosters
{
    public static void main (String args[])
    {
	new moviePosters ();
    }


    public moviePosters ()
    {
	String first[] = {"Sam", "Zoe", "Sigourney", "Stephen",
	    "Michelle", "Laz", "Wes", "Dileep", "Joel", "Giovanni", "CCH"};
	String last[] = {"Worthington", "Saldana", "Weaver", "Lang", "Rodriguez",
	    "Alonzo", "Studi", "Rao", "Moore", "Ribisi", "Pounder"};
	System.out.println ("Avatar starring....");

	for (int i = 0 ; i < last.length ; i++)
	    System.out.println (first [i] + " " + last [i]);

	System.out.println ("\nAvatar starring....");
	for (int i = 0 ; i < last.length ; i++)
	    System.out.println ((i + 1) + "  " + first [i] + " " + last [i]);

	String min = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (min.compareTo (first [i]) > 0)
		min = first [i];
	}
	System.out.println ("\nThe earliest first name is: " + min);

	String max = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (max.compareTo (first [i]) < 0)
		max = first [i];
	}
	System.out.println ("\nThe latest first name is: " + max);

	String mi = last [0];
	for (int i = 0 ; i < last.length ; i++)
	{
	    if (mi.compareTo (last [i]) > 0)
		mi = last [i];
	}
	System.out.println ("\nThe earliest last name is: " + mi);

	String ma = last [0];
	for (int i = 0 ; i < last.length ; i++)
	{
	    if (ma.compareTo (last [i]) < 0)
		ma = last [i];
	}
	System.out.println ("\nThe latest last name is: " + ma);

    }
}



public class quen
{
    public static void main (String args[])
    {
	new quen ();
    }


    public quen ()
    {
	char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
	    'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	double fre[] = {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153,
	    0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056,
	    2.758, 0.978, 2.360, 0.150, 1.974, 0.074};

	double v = fre.length;

	double sum = fre [0];
	for (int i = 0 ; i < fre.length ; i++)
	    sum = sum + fre [i];
	double av = sum / v;
	System.out.println ("\nThe average frequency is " + av);
	System.out.println ("\nThe sum of the frequency is Accurate: " + sum);

	double min = fre [0];
	for (int i = 0 ; i < fre.length ; i++)
	{
	    if (min > fre [i])
		min = fre [i];
	}
	System.out.println ("\nThe lowest frequency is " + min + ".");

	double max = fre [0];
	for (int i = 0 ; i < fre.length ; i++)
	{
	    if (max < fre [i])
		max = fre [i];
	}
	System.out.println ("\nThe highest frequency is " + max + ".");

	System.out.println ("\nSearch");
	char findMe = IBIO.inputChar ("What letter? ");
	double pos = -1;
	for (int i = 0 ; i < fre.length ; i++)
	{
	    if (letters [i] == findMe)
		pos = fre [i];
	}
	if (pos == -1)
	    System.out.println ("The value is not in the array");
	else
	    System.out.println ("The value is at position " + pos);
    }
}



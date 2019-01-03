public class energy
{
    public static void main (String args[])
    {
	new energy ();
    }


    public energy ()
    {
	int kwh[] = {432, 469, 339, 408, 658, 627, 343, 399, 503, 440,
	    230, 374, 422, 365, 520, 524, 675, 469, 490, 443, 383, 313, 331,
	    379, 967, 464, 181, 561, 529, 455, 506, 420, 529, 311, 483, 650,
	    116, 312, 544, 607, 534, 573, 529, 522, 236, 403, 337, 377, 493,
	    443, 397, 606, 587, 567, 563, 486, 554, 294, 426, 453, 643, 557,
	    417, 579, 543, 546, 1248, 494, 520, 443, 569, 521, 670, 512,
	    736, 600, 1115, 853, 713, 498, 838};

	int v = kwh.length;

	System.out.println ("The mathematician studied energy use for " + v + " months");

	int min = kwh [0];
	for (int i = 1 ; i < kwh.length ; i++)
	{
	    if (kwh [i] < min)
		min = kwh [i];
	}
	System.out.println ("The minimum is " + min);

	int max = kwh [0];
	for (int i = 1 ; i < kwh.length ; i++)
	{
	    if (kwh [i] > max)
		max = kwh [i];
	}
	System.out.println ("The maximum is " + max); 

	int sum = 0;
	for (int i = 0 ; i < kwh.length ; i++)
	    sum += kwh [i];
	int avg = sum / kwh.length;
	System.out.println ("\nAverage cost is $" + avg);


	int z = 0;
	for (int i = 1 ; i < kwh.length ; i++)
	{
	    if (kwh [i] > 300)
		z++;
	}
	System.out.println ("The number above 300 is " + z);

	int g = 0;
	for (int i = 1 ; i < kwh.length ; i++)
	{
	    if (kwh [i] > 500)
		g++;;
	}
	System.out.println ("The number above 500 is "+g);

    }
}

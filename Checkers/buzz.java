public class buzz
{
    public static void main (String args[])
    {
	new buzz ();
    }


    public buzz ()
    {
	int bee[] = {95, 92, 93, 95, 92, 100, 89, 83, 88, 89, 88, 89, 87, 95, 95, 92, 101, 78, 79, 82, 83, 95, 88, 90, 91,
	    89, 85, 82, 81, 94, 94, 95, 96, 97, 98, 95, 98, 103, 95, 91, 96, 93, 82, 95, 88, 89, 90};
	int v = bee.length;
	System.out.println ("There are " + v + " bees");

	int min = bee [0];
	for (int i = 0 ; i < bee.length ; i++)
	{
	    if (min > bee [i])
		min = bee [i];
	}
	System.out.println ("\nThe lightest bee weighs " + min + " pounds.");

	int max = bee [0];
	for (int i = 0 ; i < bee.length ; i++)
	{
	    if (max < bee [i])
		max = bee [i];
	}
	System.out.println ("\nThe heaviest bee weighs " + max + " pounds.");

	int sum = bee [0];
	for (int i = 0 ; i < bee.length ; i++)
	{
	    sum = sum + bee [i];
	}
	int av = sum / v;
	System.out.println ("\nThe average weight is " + av + " pounds.");

	int g = 0;
	for (int i = 0 ; i < bee.length ; i++)
	{

	    if (bee [i] > 95)
		g++;

	}
	System.out.println ("\n" + g + " bees weigh over 95 pounds.");

	g = 0;
	for (int i = 0 ; i < bee.length ; i++)
	{
	    if (bee [i] < av)
		g++;

	}
	System.out.println ("\n" + g + " bees weigh under the average.");

	System.out.println ("\nHere are the weight horisontally");
	for (int i = 0 ; i < bee.length ; i++)
	    System.out.print (bee [i] + "   ");

	System.out.println ("\n\nHere are the weights backwords.");
	for (int i = bee.length - 1 ; i > 0 ; i--)
	    System.out.print (bee [i] + "   ");

	System.out.println ("\n\nHere is every other weight.");
	for (int i = 0 ; i < bee.length ; i++)
	{
	    if (i % 2 == 0)
		System.out.print (bee [i] + "   ");
	}


    }
}

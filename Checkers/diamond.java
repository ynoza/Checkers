public class diamond
{
    public static void main (String arga[])
    {
	new diamond ();
    }


    public diamond ()
    {
	//double sum = 0;
	//double avg = sum / cost.length;
	//System.out.println ("\nAverage cost is $" + avg);
	//sum += cost [i];

	double carets[] = {0.23, 0.23, 0.17, 0.33, 0.25, 0.35, 0.18};
	int price[] = {595, 553, 345, 945, 655, 1086, 443};

	//a
	for (int i = 0 ; i < carets.length ; i++)
	    System.out.println (carets [i]);

	System.out.println ("");
	//b
	for (int i = 0 ; i < price.length ; i++)
	    System.out.println (price [i]);

	System.out.println ("");
	//c
	for (int i = 0 ; i < carets.length ; i++)
	    System.out.print (carets [i] + "");

	System.out.println ("");
	//d
	System.out.println ("Carets\tPrice");
	System.out.println ("-------------------");
	for (int i = 0 ; i < carets.length ; i++)
	    System.out.println (carets [i] + "\t" + price [i]);

	//e
	System.out.println ("");
	for (int i = 0 ; i < carets.length ; i++)
	    System.out.println ("A ring with " + carets [i] + " carets sold for " + price [i]);

	//f
	System.out.println ("");
	System.out.print ("Caret:\t");
	for (int i = 0 ; i < carets.length ; i++)
	    System.out.print (carets [i] +"\t");
	System.out.println ("");
	System.out.print ("Cost:\t");
	for (int i = 0 ; i < price.length ; i++)
	    System.out.print (price [i]+"\t");

    }
}

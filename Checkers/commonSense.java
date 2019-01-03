public class commonSense
{
    public static void main (String args[])
    {
	new commonSense ();
    }


    public commonSense ()
    { //Example: Days of the Week
	String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	for (int i = 0 ; i < roman.length ; i++)
	    System.out.print (roman [i] + " ");
	System.out.println ("");

	int fib[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
	for (int i = 0 ; i < fib.length ; i++)
	    System.out.print (fib [i] + " ");
	System.out.println ("");

	String rbow[] = {"Red", "Orange", "Green", "Blue", "Indigo", "Violet"};
	for (int i = 0 ; i < rbow.length ; i++)
	    System.out.print (rbow [i] + " ");
	System.out.println ("");

	String cword[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
	for (int i = 0 ; i < cword.length ; i++)
	    System.out.print (cword [i] + " ");
	System.out.println ("");

	String hs[] = {"Head", "Shoulders", "Knees", "Toes", "Ears", "Mouth", "Nose"};
	for (int i = 0 ; i < hs.length ; i++)
	    System.out.print (hs [i] + " ");
	System.out.println ("");

	String p[] = {"8:15", "9:40", "10:59", "12:14", "1:33"};
	for (int i = 0 ; i < p.length ; i++)
	    System.out.print (p [i] + " ");
	System.out.println ("");

	int pow[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
	for (int i = 0 ; i < pow.length ; i++)
	    System.out.print (pow [i] + " ");
	System.out.println ("");

	char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	for (int i = 0 ; i < alpha.length ; i++)
	    System.out.print (alpha [i] + " ");
	System.out.println ("");
    }
}


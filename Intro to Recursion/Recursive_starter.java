//********************************************************************
//  Name
//
//  Examples
//********************************************************************

public class Recursive_starter
{

    public static void main(String[] args)
	{

		foo(5);
		//System.out.print(sum (4));

		//System.out.println(recursiveMult(6,5)  );

		//System.out.println("exp = abc");
		//guess("abcdefg",0);

		//reverse_print("abcde");

		//int_guess(1);

		//System.out.println("The sum is " + sum (4));

		//System.out.println( btp (3,3));





	}//end of main


public static int btp(int a, int b)
{


	if (b == 0)
		return 1;
	else
		return a * btp(a, b - 1);
}

public static int foo(int x)
{
	if (x > 0)
		foo(x+1);

	return 0;
}

public static void reverse_print(String str)
{


	reverse_print("blah");





}







public static int mystery (int num)
{
	//System.out.println(num );
	if (num == 1)
		return 1;
	else
	{

		return num + mystery(num-1);

	}


}


}// end of class








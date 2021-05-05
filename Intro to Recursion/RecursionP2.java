
/**
 * Write a description of class RecursionP2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionP2
{
    public static void main (String[] args)
    {
        //recursionPrint2(5);
        int test = 9;
        System.out.println(isPrime(test, test - 1));
        System.out.println(reverse("This is a test"));
    }
    
    public static void recursionPrint2(int n)
    {
        if (n == 0)
            System.out.print(n + " ");
        
        else
        {
            recursionPrint2(n - 1);
            System.out.print(n + " ");
            
        }
    }
    
    public static boolean isPrime(int n, int divisor)
    {
        if (divisor <= 1)
            return true;
        
        else
        {
            if (n % divisor == 0)
                return false;
            
            else
                return isPrime(n, divisor - 1);
        }
    }
    
    public static String reverse(String input)
    {
        if (input.equals("")) return "";
        return reverse(input.substring(1,input.length())) + input.charAt(0);
    }
}


/**
 * Recursive greatest common divisor algorithm
 *
 * @author (John Niemiec)
 * @version (May 7, 2021)
 */
public class GCD
{
    public static void main (String[] args)
    {
        System.out.println(gcd(7,28));
        System.out.println(gcd(8,32));
        System.out.println(gcd(9,21));
    }
    
    public static int gcd (int num1, int num2)
    {
        if (num2 <= num1 && num1 % num2 == 0)
            return num2;
            
        else if (num1 < num2)
            return gcd(num2,num1);
        
        else
            return gcd(num2, num1%num2);
    }
}


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
        System.out.println(gcd(102,42));
    }
    
    public static int gcd (int num1, int num2)
    {
        if (num2 == 0)
            return num1;
            
        return gcd(num2, num1%num2);
    }
}

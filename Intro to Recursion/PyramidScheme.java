
/**
 * What the pyramid scheme would look like using recursion
 *
 * @author (John Niemiec)
 * @version (5/11/2021)
 */
public class PyramidScheme
{
    public static void main(String[] args)
    {
        System.out.println(collect(1000));
    }
    
    public static int collect(int monetaryGoal)
    {
        int sum = 0;
        if (monetaryGoal == 1)
        {
            return 1;
        }
        
        else
        {
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            sum += collect(monetaryGoal / 10);
            return sum;
        }
    }
}

package actualRoundingErrorDemo;

public class RoundingErrorDemo
{

    public static void main(String[] args)
    {
        double total = 0.0;
        total += 1.99;
        total += 2.49;
        total += 0.99;
        System.out.println(total); // total should be $5.47
        
        final double TOLERANCE = 0.009;
        
        if(Math.abs(total - 5.47) < TOLERANCE)
            System.out.println("total is 5.47");
    }

}

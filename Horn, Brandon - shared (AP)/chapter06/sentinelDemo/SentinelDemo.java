package sentinelDemo;

import java.util.Scanner;

public class SentinelDemo
{

    public static void main(String[] args)
    {
        /*
         * finds the sum of all non-negative numbers entered by the user.
         * user enters a negative value to indicate no more values.
         * the negative value should not be included in the sum.
         */
        
        Scanner fromKeyboard = new Scanner(System.in);
        
        int sum = 0;
        
        String prompt = "Enter a value (negative to quit): ";
        System.out.print(prompt);
        int input = fromKeyboard.nextInt();
        
        while(input >= 0)
        {
            sum += input;
            
            System.out.print(prompt);
            input = fromKeyboard.nextInt();
        }
        
        fromKeyboard.close();
        
        System.out.println("sum: " + sum);
    }

}

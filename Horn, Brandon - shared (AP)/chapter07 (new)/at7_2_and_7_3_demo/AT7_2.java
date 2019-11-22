package at7_2_and_7_3_demo;

public class AT7_2
{
    public static void main(String[] args)
    {
        int[][] ragged = { {1}, {1, 2}, {1, 2, 3} };
//        int[][] ragged = { {1, 2, 3}, {1}, {1, 2} };
        
        System.out.println("ragged.length: " + ragged.length);
        
        System.out.println("ragged[0].length: " + ragged[0].length);
        System.out.println("ragged[1].length: " + ragged[1].length);
        System.out.println("ragged[2].length: " + ragged[2].length);
        
        for(int r = 0; r < ragged.length; r++)
        {
            for(int c = 0; c < ragged[r].length; c++)
//            for(int c = 0; c < ragged[0].length; c++)
                System.out.print(ragged[r][c] + " ");
            
            System.out.println();
        }
    }
}
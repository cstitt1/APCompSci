package at7_2_and_7_3_demo;

public class AT7_3
{
    public static void main(String[] args)
    {
        int[][][][] goofy = new int[2][3][4][2];
        
        goofy[0][0][2][1] = 10;
        
        System.out.println(goofy[0][0][2][1]);
    }
}

package nullDemo;

import referenceDemo2.Coordinate2D;

public class NullDemo
{
    public static void main(String[] args)
    {
        Coordinate2D mine = null;
        
        System.out.println(mine);
        
        if(mine == null)
            System.out.println("is null");
        else
            System.out.println("is not null");
        
        System.out.println(mine.getX());
    }

}

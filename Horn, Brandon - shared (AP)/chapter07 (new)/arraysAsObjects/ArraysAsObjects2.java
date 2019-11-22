package arraysAsObjects;

public class ArraysAsObjects2
{
    public static void main(String[] args)
    {
        Coordinate2D[] coors = new Coordinate2D[3];
        coors[0] = new Coordinate2D(6, 5);
        coors[1] = new Coordinate2D(7, 6);
        coors[2] = new Coordinate2D(8, 7);
        
        System.out.println(coors[0]);
        mystery1(coors);
        System.out.println(coors[0]);
        
        System.out.println(coors[1]);
        mystery2(coors[1]);
        System.out.println(coors[1]);
        
        System.out.println(coors[2]);
        mystery3(coors[2]);
        System.out.println(coors[2]);
    }
    
    public static void mystery1(Coordinate2D[] arr)
    {
        arr[0] = new Coordinate2D(11, 2);
    }
    
    public static void mystery2(Coordinate2D val)
    {
        val = new Coordinate2D(12, 7);
    }
    
    public static void mystery3(Coordinate2D val)
    {
        val.setX(100);
    }
    
}

package forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachDemos
{

    public static void main(String[] args)
    {
//        vIsACopy();
//        cIsACopy();
//        structuralModifications();
    }

    private static void vIsACopy()
    {
        int[] vals = new int[]{5, 7, 9};
        
        for(int i = 0; i < vals.length; i++)
        {
            vals[i] = 6;
        }
        System.out.println(Arrays.toString(vals));
        
        // v is a COPY of the value in the array
        
        for(int v : vals)
        {
            v = 7;
        }
        System.out.println(Arrays.toString(vals));
    }
    
    private static void cIsACopy()
    {
        Coordinate2D[] coors = new Coordinate2D[3];
        
        for(int i = 0; i < coors.length; i++)
            coors[i] = new Coordinate2D(6, 6);
        
        System.out.println(Arrays.toString(coors));
        
        // c is a COPY of the value in the array
        
        for(Coordinate2D c : coors)
        {
//            c = new Coordinate2D(7 ,7);
            
            c.setX(7);
            c.setY(7);
        }
        
        System.out.println(Arrays.toString(coors));
    }
    
    private static void structuralModifications()
    {
        ArrayList<Coordinate2D> coorList = new ArrayList<Coordinate2D>();
        
        for(int n = 1; n <= 3; n++)
            coorList.add(new Coordinate2D((int) (Math.random() * 10), 6));
        
        System.out.println(coorList);
        
        for(Coordinate2D c : coorList)
        {
            if(c.getX() < 6)
                coorList.remove(c);
            
//            coorList.remove(c);
//            coorList.add(c);
        }
        
        System.out.println(coorList);
    }
}

package sorts.objects.list;

import java.util.*;

import sorts.objects.IntegerComparator;

public class Test
{
	public static void main(String[] args)
	{
		testSortInteger();
	}
	
    public static void testSortInteger(int algorithm)
    {
    	List<Integer> a = new ArrayList<Integer>();
        IntegerComparator c = new IntegerComparator();
     
        for(int i = 1; i <= 10; i++)
        	a.add((int) (Math.random() * 100));
        
        System.out.println("a: " + a);
        
        switch(algorithm)
        {
            case 0:
                System.out.println("java.util.Collections.sort(a,c)");
                java.util.Collections.sort(a,c);
                break;
            
            case 1:
                System.out.println("SelectionSort.sort(a,c)");
                SelectionSort.sort(a,c);
                break;
        }
        
        System.out.println("a: " + a);
    }
}

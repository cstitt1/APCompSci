package arrays;

import junit.framework.TestCase;

public class ArraysTest extends TestCase
{
    public void testFindSecondLargest()
    {
        int[] values = new int[]{7, 9, 12, 8, 3};
        assertTrue(Arrays.secondLargest(values) == 9);
        
        values = new int[]{7, 9, 12, 8, 12};
        assertTrue(Arrays.secondLargest(values) == 12);
        
        values = new int[]{7, 9, 12, 8, 11};
        assertTrue(Arrays.secondLargest(values) == 11);
        
        values = new int[]{7, 7};
        assertTrue(Arrays.secondLargest(values) == 7);
        
        values = new int[]{7, 8};
        assertTrue(Arrays.secondLargest(values) == 7);
        
        values = new int[]{8, 7};
        assertTrue(Arrays.secondLargest(values) == 7);
    }
    
    public void testXLargest()
    {
        int[] values = new int[]{7, 9, 12, 8, 3};
        int[] xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{8, 9, 12}));
        
        values = new int[]{7, 9, 12, 8, 12};
        xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{9, 12, 12}));
        
        values = new int[]{7, 9, 12, 8, 11};
        xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{9, 11, 12}));
        
        values = new int[]{7, 7, 7};
        xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{7, 7, 7}));

        values = new int[]{7, 8, 7};
        xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{7, 7, 8}));
        
        values = new int[]{8, 7, 7};
        xLargest = Arrays.xLargest(values, 3);
        assertTrue(arraysMatchAnyOrder(xLargest, new int[]{7, 7, 8}));
    }
    
    private static boolean arraysMatchAnyOrder(int[] one, int[] two)
    {
        if(one.length != two.length)
            return false;
        
        int[] oneCopy = one.clone();
        int[] twoCopy = two.clone();
        
        java.util.Arrays.sort(oneCopy);
        java.util.Arrays.sort(twoCopy);
        
        return java.util.Arrays.equals(oneCopy, twoCopy);
    }
}
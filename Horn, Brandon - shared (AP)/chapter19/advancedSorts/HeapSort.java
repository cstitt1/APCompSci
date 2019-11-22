package advancedSorts;

import java.util.Comparator;

public class HeapSort
{
	public static <T> void sort(T[] a, Comparator<T> c)
	{
		
	}
	
	private static void swap(Object[] x, int i, int j)
	{
		Object temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}
}

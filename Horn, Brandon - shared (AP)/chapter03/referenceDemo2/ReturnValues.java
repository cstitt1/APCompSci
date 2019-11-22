package referenceDemo2;

public class ReturnValues
{
	public static void main(String[] args)
	{
		Coordinate2D a = new Coordinate2D(1,3);
		Coordinate2D b = new Coordinate2D(1,7);
		Coordinate2D midpoint;
		
		// example 1
		midpoint = new Coordinate2D();
		midpoint(a, b, midpoint); // runs 1st method
		
		/*
		// example 2
		midpoint = null;
		midpointError(a, b, midpoint); // runs 2nd method
		*/
		
		
		// example 3
		//midpoint = midpoint(a, b); // runs 3rd method
		
		
		System.out.println(midpoint); // note: actual midpoint is: (1,5)
	}
	
	// correctly runs mutator methods on an object passed in
	public static void midpoint(Coordinate2D q, Coordinate2D r, Coordinate2D mid)
	{
		mid.setX((q.getX() + r.getX()) / 2);
	    mid.setY((q.getY() + r.getY()) / 2);
	}
	
	// incorrectly assumes updating the value of mid (the memory location) will
	// update the value of the argument in the calling method
	public static void midpointError(Coordinate2D q, Coordinate2D r, Coordinate2D mid)
	{
	    int x = (q.getX() + r.getX()) / 2;
	    int y = (q.getY() + r.getY()) / 2;
	    mid = new Coordinate2D(x,y);
	}
	
	// correctly returns a reference to an object constructed in the method
	public static Coordinate2D midpoint(Coordinate2D a, Coordinate2D b)
	{
	    int x = (a.getX() + b.getX()) / 2;
	    int y = (a.getY() + b.getY()) / 2;
	    Coordinate2D mid = new Coordinate2D(x,y);
	    return mid;
	}
}

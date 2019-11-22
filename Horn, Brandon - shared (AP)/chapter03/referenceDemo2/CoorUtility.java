package referenceDemo2;

public class CoorUtility
{
	public static double distance(Coordinate2D a, Coordinate2D b)
	{
	    int xSqrd = a.getX() + b.getX();
	    xSqrd *= xSqrd;
	    
	    int ySqrd = a.getY() + b.getY();
	    ySqrd *= ySqrd;
	    
	    return Math.sqrt(xSqrd + ySqrd);
	}
}

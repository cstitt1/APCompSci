package referenceDemo2;

public class Coordinate2D
{
    private int x, y;
    
    public static final int originX = 0;
    public static final int originY = 0;
    
    public Coordinate2D()
    {
       this(0, 0);
    }
    
    public Coordinate2D(int initX, int initY)
    {
        x = initX;
        y = initY;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    public String toString()
    {
        return "(" + this.getX() + ", " + getY() + ")";
    }
    
    public boolean equals(Coordinate2D other)
    {
        return this.getX() == other.getX() && getY() == other.getY();
    }

    public int hashCode()
    {
        return (x + y) * 17;
    }
    
    public double distance(Coordinate2D that)
    {
        return CoorUtility.distance(this, that);
    }
}

package petExample;

public class Iguana extends Pet
{
    private int tailLength;
    
    public Iguana(String name, int tailLength)
    {
        super(name);
        
        this.tailLength = tailLength;
    }
    
    public int getTailLength()
    {
        return tailLength;
    }
    
    public String toString()
    {
        return super.toString() + " is a freakin' iguana (but not a cat)";
    }
    
    public boolean canEat(String foodType)
    {
        return "cricket".equals(foodType);
    }
}

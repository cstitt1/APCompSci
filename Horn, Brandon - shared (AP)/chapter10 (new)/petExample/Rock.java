package petExample;

public class Rock extends Pet
{
    private String type;
    private int weight;
    
    public Rock(String name, String type, int weight)
    {
        super(name);
        
        this.type = type;
        this.weight = weight;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public void loseWeight(int amount)
    {
        weight -= amount;
    }
    
    public String toString()
    {
        // "My pet ___ is a rock"
//        return "My pet " + name + " is a rock"; // not syntactically valid
//        return "My pet " + getName() + " is a rock"; // syntactically valid but not a great approach
        return super.toString() + " is a rock";
    }
    
    public boolean canEat(String foodType)
    {
        return false;
    }
}

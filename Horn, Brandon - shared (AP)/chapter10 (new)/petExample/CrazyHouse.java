package petExample;

public class CrazyHouse
{

    public static void main(String[] args)
    {
        Pet myPet = new Rock("Rocky", "Mystery", 15);
        
        if(Math.random() < 0.25) // 25% that the rock hatches
        {
            myPet = new Iguana("Izzy", 15);
        }
        
        System.out.println(myPet.getName());
        System.out.println(myPet);
        System.out.println(myPet.toString());
        
        System.out.println(myPet.canEat("cricket"));
        
        if(myPet instanceof Iguana)
        {
            Iguana myIguana = (Iguana) myPet;
    //        System.out.println(myPet.getTailLength());
            System.out.println(myIguana.getTailLength());
        }
        
        if(myPet instanceof Rock)
        {
    //        System.out.println(myPet.getWeight());
            System.out.println(((Rock) myPet).getWeight());
        }
        
        // The reference type determines what methods you can run.
        // The object type determines what method is actually run.
        
        
//        Rock myPetRock = new Rock("Dwayne", "granite", 300);
//        
//        System.out.println(myPetRock.getName());
//        System.out.println(myPetRock.getType());
//        System.out.println(myPetRock.getWeight());
//        System.out.println(myPetRock.toString());
//        System.out.println(myPetRock);
//        
//        Rock myBiggerPetRock = new Boulder("Rocky", 1500);
//        
//        if(myBiggerPetRock instanceof Boulder)
//            System.out.println("It's a boulder!");
//        
//        Boulder myPetBoulder = (Boulder) myBiggerPetRock;
//        
//        Pet myPet = myPetBoulder;
    }

}

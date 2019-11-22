package substitution;

public class SubBoxRunner
{

    public static void main(String[] args)
    {
        SubBox sb = new SubBox();
        String cipherText = sb.encrypt("FIREWOOD IS NECESSARY FOR BIG FIRES!");
        System.out.println(sb.decrypt(cipherText));
    }
}

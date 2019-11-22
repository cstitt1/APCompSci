package polymorphismWithinClassExample;

public class Runner
{

	public static void main(String[] args)
	{
		example1();
//		example2();
	}
	
	public static void example1()
	{
		Superman superman = new Superman();
		superman.methodA();
	}

	public static void example2()
	{
		Subman subman = new Subman();
		subman.methodA();
	}
}

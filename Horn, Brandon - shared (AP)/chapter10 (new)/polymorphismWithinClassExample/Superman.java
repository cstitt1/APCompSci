package polymorphismWithinClassExample;

public class Superman
{
	public void methodA()
	{
		System.out.println("methodA from Superman");
		methodB();
	}
	
	public void methodB()
	{
		System.out.println("methodB from Superman");
	}
}

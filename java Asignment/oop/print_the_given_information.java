package asigmnent;

class si
{
	
	public void displayparent()
	{
		System.out.println("this is parentclass");
	}
}
class b extends si
{
	public void displaychield()
	{
		System.out.println("this is child class");
	}
}
public class print_the_given_information
{

	
	public static void main(String[] args)
	{

        si s1 = new si();
		b  s2 = new b();
		
		
        s1.displayparent();
		s2.displaychield();
		
	}
}

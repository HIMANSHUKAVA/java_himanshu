package asigmnent;
class sop
{
	void print()
	{
		System.out.println("This is is shape");
	}
}
class Rectangle extends sop
{
	void prints()
	{
		System.out.println("This is rectangular shape");
	}
}
class  circle extends sop
{
	void printc()
	{
		System.out.println("This is circular shape");
	}
}
class Square extends Rectangle
{

	void prinm()
	{
		System.out.println("Suare is rectangle");
	}
	
}
public class shape {

	
	public static void main(String[] args) {
		
		Square ss = new Square();
		ss.print();
		ss.prints();
		
	}
}

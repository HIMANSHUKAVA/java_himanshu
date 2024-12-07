package asigmnent;
class rectangle
{
	
	float length , breadth;
	
	 rectangle(float length , float breadth)
	{
		// TODO Auto-generated constructor stub
		
		this.length=length;
		this.breadth= breadth;
	}
	
	 void area()
	{
	
	System.out.println("area of rectangl is "+(length*breadth));	
	}
	
	 void perimiter()
	{
		float s =  2 * length + breadth;
		System.out.println(s);
	}
	
}
class square extends rectangle

{

   public square(int side)
   {
	// TODO Auto-generated constructor stub
	   super(side,side);
	   
   }	
	
}

public class rcp 
{

	public static void main(String[] args) {
		
		rectangle s = new rectangle(4, 5);
		s.area();
		s.perimiter();
		
		square a = new square(5);
		a.area();
		a.perimiter();
		
	}
}

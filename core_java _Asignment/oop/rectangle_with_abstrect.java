package asigmnent;

abstract class  Shape
{
	abstract void RectangleArea();
	abstract void SquareArea();
	abstract void CircleArea();
	
}


class Area extends Shape
{
	
	float length , width , side ;
	double r ,s;

	public Area(float length , float width)
	{
		// TODO Auto-generated constructor stub
		
		this.length=length;
		this.width=width;
	}
	
	public Area( float side) {
		 this.side = side;
	}
	
	
	public Area(double r , double s) 
	{
		
	     this.r=r;
	     this.s = s;

	}
	
	@Override
	void RectangleArea() {

		System.out.println("Area Of Rechtangle Is :"+(length*width));
		
	}

	@Override
	void SquareArea() {
		// TODO Auto-generated method stub
		System.out.println("Area Of Square Is :"+(side*side));
		
	}

	
	@Override
	void CircleArea() 
	{
		// TODO Auto-generated method stub
		System.out.println("Area Of Circle Is :"+(s*r*r));
		
	}
	
}
public class rectangle_with_abstrect {

	public static void main(String[] args) {
		
		Shape ss = new Area(3.25f);
		  ss.SquareArea();
        Shape s = new Area(3.25, 3.15);		
	      s.CircleArea();
	    Shape m = new Area(4.25f, 3.26f);
	      m.RectangleArea();
	}
}

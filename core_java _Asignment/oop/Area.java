package Task_3_08_20244;

import java.util.Scanner;

public class Area {

	float side;
    float breadth;
    float length;
    
   static void area_of_square(float breadth , float length)
    {
      System.out.println("Area Of Rectangle is : "+(breadth * length));
    }
     static void area_of_square(float side)
    {
    	System.out.println("Area Of Square Is : "+(side*side));
    }
    public static void main(String[] args) {
		
    	Scanner hk = new Scanner(System.in);
    	
    	System.out.println("Enter The side");
    	float sidef = hk.nextFloat();
    	System.out.println("Enter The Breadth");
    	float breadth = hk.nextFloat();
    	System.out.println("Enter The Length");
    	float length = hk.nextFloat();
    	
    	area_of_square(breadth , length);
    	area_of_square(sidef);
    	
    	
    	
    	
	}
}

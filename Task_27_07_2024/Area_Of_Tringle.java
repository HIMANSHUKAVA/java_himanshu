package Task_27_07_2024;

import java.util.Scanner;

public class Area_Of_Tringle {
	
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("press 1 : Area Of Circle");
		System.out.println("Press 2 : Area Of Tringle");
		System.out.println("Press 3 : Area Of Rectangle");
		System.out.println("------------------------------");
		
		System.out.println("Please Enter Your Choes");
		int m = hk.nextInt();
				
		switch(m)
		{
		case 1:
			System.out.println("-----------------Your Choes Is Area Of Circle-------------------");
			System.out.println("Please Enter The radius");
			float a = hk.nextFloat();
		    System.out.println("----------------Ans----------------------------------------------");
			System.out.println("Area Of Circle Is : " + (3.14 * a*a));
			break;
		case 2:
			System.out.println("------------------Your choes Is Tringle--------------------------");
			System.out.println("Please Enter The Base");
			float b = hk.nextFloat();
			System.out.println("Please Enter The Height");
			float c = hk.nextFloat();
			System.out.println("-----------------Ans----------------------------------------------");
			System.out.println("Area Of Tringle Is : " + (0.5*b*c));
			break;
			
		case 3 :
			System.out.println("-----------------------Your Choes Is Rectangle--------------------");
			System.out.println("Please Enter The Base");
		    float k = hk.nextFloat();
		    System.out.println("Please Enter The length");
		    float o = hk.nextFloat();
		    float u = 2*(k+o);
		    System.out.println("----------------Ans-----------------------------------------------");
		    System.out.println("Area Of Rectangle Is : " + u);
		    break;
		}
	}

}

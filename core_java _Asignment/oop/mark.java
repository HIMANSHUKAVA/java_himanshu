package asigmnent;

import java.util.Scanner;

class point
{
	
	void getdata()
	{
		  try (Scanner ss = new Scanner(System.in)) {
			System.out.println("Enter Your marks");
	         int n = ss.nextInt();
	         
	         if(n==100)
	         {
	        	 System.out.println("A Grade");
	         }
	         else if(n>90)
	         {
	        	 System.out.println("B+ grade");
	         }
	         else if(n>80)
	         {
	        	 System.out.println("B grade");
	         }
	         else if(n>70)
	         {
	        	 System.out.println("C grade");
	         }
	         else if(n>60)
	         {
	        	 System.out.println("D grade");
	         }
	         else if(n>40 && n<50)
	         {
	        	 System.out.println("DD grade");
	         }
	         else
	         {
	        	 System.out.println("Fail");
	         }
		}
	        	 
	}
	
	
	
}
public class mark {

	
	
	public static void main(String[] args) {
		

		
		point ss = new point();
		ss.getdata();
		
	}
}

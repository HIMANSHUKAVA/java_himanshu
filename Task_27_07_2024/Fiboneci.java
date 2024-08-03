package Task_27_07_2024;

import java.util.Scanner;

public class Fiboneci {
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		
		System.out.println("Enter The Fiboneci number");
		int n = hk.nextInt();
		int b = 1;
		int a = 0;
		int c =0;
	    for (int i=0;i<=n;i++)                         //a=o,b=1,    c=1,2,3 
		{
	
		  c = a+b;
		  System.out.println(i+ "number of feboneci is : "+c);
	
		  a=b;
		  b = c;
			 
		}
//		  System.out.println(c);
	
	}

}

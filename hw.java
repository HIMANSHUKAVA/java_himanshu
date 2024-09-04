package Patterns;

import java.util.Scanner;

public class hw {
	
	public static void main(String[] args) {
		
	Scanner ss = new Scanner(System.in);
	
	System.out.println("Enter Your Number");
	int n= ss.nextInt();
  
	int m=n;
		for(int i=1;i<=n;i++)
		{
			
			
			for(int j=1;j<=m;j++)
			{
			  System.out.print(m);	
			}
		
			m--;
			System.out.println();
		
		}
		
		
		
		
	}

}

package Task_27_07_2024;

import java.util.Scanner;

public class Prime_Or_Not_Prime {

	public static void main(String[] args) {
		Scanner hk = new Scanner(System.in);
		
		System.out.println("Please Enter The Number : ");
		int n = hk.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 )
			{
				count++;
			}
				
		}
		if(count==2) System.out.println("The Number Is Prime");
		else System.out.println("The Number Is Not Prime");
	}
}

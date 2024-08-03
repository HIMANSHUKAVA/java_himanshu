package Task_27_07_2024;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
				
		System.out.println("Enter the Number");
		int n= hk.nextInt();
		int sum = 1;
		System.out.println("this given number");
		for(int i=1;i<=n;i++)  
		{
			sum *=i;
		
			System.out.println(i);
		}
		System.out.println("\n THe factorial of number is : "+sum);
	
	}
}

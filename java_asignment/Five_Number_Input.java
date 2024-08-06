package java_asignment;

import java.util.Scanner;

public class Five_Number_Input {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Please Enter The  Number : ");
			int n = s.nextInt();
			int sum = 0;
			int count=0;
			for(int i=1;i<=n;i++)
			{
				int rem = n%10;
				sum+=rem;
				n = n/10;
				count++;
			}
			System.out.println("The Sum Of Given Number Is : "+sum);
			System.out.println("The Average Of Sum Number Is : "+(sum/count));
		}
	}
}

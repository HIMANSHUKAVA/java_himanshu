package Task_27_07_2024;

import java.util.Scanner;

public class Sum_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hk = new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		int n = hk.nextInt();
		
		int sum=0;
		
		while(n>0)
		{
		    int rem = n%10;
		    sum = sum + rem;
			n/=10;
		}
		System.out.println("The Sum Of Given Number Is : "+sum);

	}

}

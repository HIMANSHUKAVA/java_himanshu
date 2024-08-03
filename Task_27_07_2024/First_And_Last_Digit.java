package Task_27_07_2024;

import java.util.Scanner;


public class First_And_Last_Digit {
	
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = hk.nextInt();
		int Last_Digit=0;
		int First_DIgit = 0;
		int sum =0;
	   {
		   int rem = n%10;
		   Last_Digit+=rem;
		   int f = n/1000;
		   First_DIgit+=f;
		   sum =   First_DIgit + Last_Digit;
		   
	   }
	   System.out.println(First_DIgit);
	   System.out.println(Last_Digit);
       System.out.println(sum);
	 
	}

}

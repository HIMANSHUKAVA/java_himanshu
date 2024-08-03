package Task_27_07_2024;

import java.util.Scanner;

public class Max_Number {
	public static void main(String[] args) {
		
	
	
	Scanner hk = new Scanner(System.in);
	
	int max = 0;
	System.out.println("Enter The Number : ");
	int n = hk.nextInt();
	int rem;
	
    while(n>0)
	{
	   rem = n%10;
	   if(max < rem)
	   {
		   max = rem;
	   }
	   n/=10;
	}
	System.out.println("Max Number is : "+ max);
	}

}

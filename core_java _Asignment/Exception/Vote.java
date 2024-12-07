package Exception;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		System.out.println("Enter The Age");
		int s = hk.nextInt();
	
		if(s>18)
		{
			System.out.println("Welcome To Vote");
		}
		else
		{
			throw new ArithmeticException("Age Is Not Valid");
		}

		
		
		
	}

}

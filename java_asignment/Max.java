package java_asignment;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter The Number One");
		int a = s1.nextInt();
		System.out.println("Enter The Number Two");
		int b= s1.nextInt();
		System.out.println("Enter The Number Three");
		int c = s1.nextInt();
		
			if(a>b && a>c)
			{
				System.out.println("A iIs Greater");
			}
			else if(b>a && b>c)
			{
				System.out.println("B Is Grater");
			}
			else if(c>a && c>b)
			{
				System.out.println("C Is Grater");
			}
		
		
		
	}

}

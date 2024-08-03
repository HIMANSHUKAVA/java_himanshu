package Task_27_07_2024;

import java.util.Scanner;

public class Reverce {
public static void main(String[] args) {
	Scanner hk = new Scanner(System.in);
	
	System.out.println("Enter The Number");
	int n = hk.nextInt();
	int rem;
    while(n>0)
	{
		rem = n%10;
		int m= rem;
		System.out.print(m);
		n = n/10;
	}
}
}

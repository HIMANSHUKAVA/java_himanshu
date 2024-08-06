package java_asignment;

import java.util.Scanner;

public class Natural_Number {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int n = s.nextInt();
		
		int i=0;
		if(n<0)
		{
			System.out.println("Not Natural Number");
		}
		else
		{
			System.out.println("Natural Number");
			
		while(i<=n)
		{
			System.out.println(""+i);
			i++;
		}
		}
	}

}

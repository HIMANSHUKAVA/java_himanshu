package arrays;

import java.util.Scanner;

public class String_length
{


	public static void main(String[] args)
	{
		Scanner ss =  new Scanner(System.in);
		
		System.out.println("Enter your name");
		String n = ss.nextLine();
		
		char[] s =  n.toCharArray();
		
		
		int length=0;
		
		for(int i=0;i<s.length;i++)
		{
			length++;
		}
		
		System.out.println(length);
        
        
	
	
	}
}

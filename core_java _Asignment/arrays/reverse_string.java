package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_string 
{

	
	public static void main(String[] args)
	{
		
        Scanner ss =  new Scanner(System.in);
		
		System.out.println("Enter your name");
		String n = ss.nextLine();
		
     
        String rev="";
        for(int i=n.length()-1;i>=0;i--)
        {
        	rev =  rev + n.charAt(i);
        }

        System.out.println(rev);
        
        
        
        if(n.equals(rev))
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println("not equal");
        }
	}
	
}

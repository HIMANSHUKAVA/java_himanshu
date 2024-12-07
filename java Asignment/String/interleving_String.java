package asigmnent;

import java.util.Scanner;

public class interleving_String 
{

	public static void findinterleving(String fs , String ss , String result)
	{
		
		if(fs.length()==0 && ss.length()==0)
		{
			System.out.println(result);
			return;
		}
		if(fs.length()>0)
		{
			findinterleving(fs.substring(1), ss, result + fs.charAt(0));
		}
		if(ss.length()>0)
		{
			findinterleving(fs, ss.substring(1), result+ss.charAt(0));
		}
		
		
		
		
	}
	public static void main(String[] args) 
	{
	
		Scanner ss =  new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String h =  ss.nextLine();
		
		System.out.println("Enter the seconf String");
		String k =  ss.nextLine();
		
		
		
		
		System.out.println("possible result are : ");
		findinterleving(k, h, "");
		
	}
}

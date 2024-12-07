package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class first 
{

	public static void main(String[] args) 
	{
		int[] a = {20,10,30,40,50,80};
		int n=0;
		int s=0;
		// fnid the first max number
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>s)
			{
				s = a[i];
			}
			
		}

		System.out.println(s);
	
		// find the second max number
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				n =  a[i];
			}
			
		}
		System.out.println(n);

			
	}

	
}

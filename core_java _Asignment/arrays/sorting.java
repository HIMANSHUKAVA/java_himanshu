package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class sorting 
{

	private static final Object[] Array = null;

	public static void main(String[] args) 
	{
	
		int[] array1 =  new int[10];
		int[] array2 =  new int[10];
		
		
		Scanner ss =  new Scanner(System.in);
		
		// input 2  arrays from user givern size
		 System.out.println("Enter elements for Array 1:");
		 int n = ss.nextInt();
				 
				 
				 
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element  of "+ i);
			array1[i] = ss.nextInt();			
			
		}
		
		
	   System.out.println("Enter elements for Array 2:");
	   int s =  ss.nextInt();
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter the element of " +i);
			array2[i] = ss.nextInt();			
		}
		
		
	
		System.out.println("there are two opetion of sorting 1)asecnding 2)decending");
		int o =  ss.nextInt();
		
		if(o==1)
		{
			Arrays.sort(array1);
			Arrays.sort(array2);
			
		}
		else  if (o==2)
		{
			 reverse(array1);
			 reverse(array2);
		}
		

	
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}
	
	public static void reverse(int[] array)
	{
		
		int start=0;  
		int end =  array.length -1;
		
		
		while(start<end)
		{
			int temp = array[start];

			array[start] =  array[end];
			array[end] =  temp;
			
			start++;
			end--;
			
		}
	}
	
}

package Threads;

import java.util.Scanner;

public class sleep_threaad  extends Thread
{

	@Override
	public void run() 
	{
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter your number");
		int o =  s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			try
			{
			Thread.sleep(2000);
			System.out.println(o+"*"+i+"="+ o*i );
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	  	
	}
	
	public static void main(String[] args) 
	{
	
		
		sleep_threaad t =  new sleep_threaad();
		t.start();
		
		
	}
}

package Threads;

public class third extends Thread
{

	@Override
	public void run() 
	{
	
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) 
	{
	
		third s =  new third();
		s.start();
		
	       s.start();
		
	}
}

package Threads;

public class demon_thread  extends Thread
{
	@Override
	public void run()
	{

		if(Thread.currentThread().isDaemon())
		{
		  System.out.println("demon thread");	
		}
		else
		{
			System.out.println("normal thread");
		}
		
		
	}

	public static void main(String[] args) 
	{
		

		System.out.println("main thread called");
		demon_thread s = new demon_thread();
		demon_thread s1 =  new demon_thread();
		s.setDaemon(true);
		s.start();
		s1.start();
		
	}
	
	
}

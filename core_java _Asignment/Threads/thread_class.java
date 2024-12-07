package Threads;

public class thread_class  extends Thread
{
	
	public void run()
	{
	 
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("odd number"+i);
			}
			else
			{
				System.out.println("Even Number"+i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		thread_class s = new thread_class();
		s.start();
		
		
		
	}

}

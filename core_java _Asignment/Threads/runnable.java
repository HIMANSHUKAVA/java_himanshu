package Threads;

public class runnable implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("class called");
		}
	
	public static void main(String[] args) {
		
		runnable s = new runnable();
	   
		Thread m=  new Thread(s);
		m.start();
		
	}

}

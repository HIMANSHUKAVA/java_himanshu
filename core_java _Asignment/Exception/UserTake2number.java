package Exception;

import java.util.Scanner;

public class UserTake2number {
	
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		System.out.println("Enter The First Number");
        int a = hk.nextInt();
		System.out.println("Enter The Second Number");
	    int b = hk.nextInt();
		
        	int  c = a/b;
    		try
    		{
    			System.out.println(c);
    		}
    		catch(ArithmeticException e)
    		{
    			c = a/0;
    			e.printStackTrace();
    		}
    		finally
    		{
    			System.out.println("Sucess");
    		}
	}

}

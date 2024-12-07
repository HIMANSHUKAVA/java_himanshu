package Exception;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		
		try
		{
			Scanner ss =  new Scanner(System.in);
			System.out.println("Enter The First Number");
			float n = ss.nextFloat();
			System.out.println("Enter The Second Number");
			float m = ss.nextFloat();
			
			float o = n/m;
			System.out.println("Division Is"+o);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Sucess");
		}
		
		
	}
}

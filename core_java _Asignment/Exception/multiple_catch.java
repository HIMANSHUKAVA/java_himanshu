package Exception;

public class multiple_catch {
	
	public static void main(String[] args) {
		
		
		try
		{
			int []a = new int[5];
			a[5] = 30/0; // throw the arithmetic exception	
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
			s.printStackTrace();
		}
		finally
		{
			System.out.println("Sucess");
		}
		
		
		
	}

}

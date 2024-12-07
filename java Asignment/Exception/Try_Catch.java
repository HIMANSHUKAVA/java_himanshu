package Exception;

import java.io.FileOutputStream;

public class Try_Catch {
	
	public static void main(String[] args) {
		// hendle the filenotfound exception in try catch and finally
		try
		{
		   FileOutputStream ss = new FileOutputStream("D:\\ himanshu.txt");
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("sucess");
		}
		
		
		
	}

}

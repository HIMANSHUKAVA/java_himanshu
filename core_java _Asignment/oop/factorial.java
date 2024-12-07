package asigmnent;

import java.util.Scanner;

class s
{
	int n;
	public  void getdata()
	{
	Scanner m = new Scanner(System.in);
	System.out.println("Enter The Fectorial Number");
    n = m.nextInt();

	}
	
	int fc=1;
	
	void answer()
	{
		for(int i=1;i<=n;i++)
		{
			fc*=i;
			System.out.println("The Given Fectorial of "+i+" Is "+fc);
		}
//		
//		System.out.println("The Given Fectorial Number Is :"+fc);
		
	}
   
}
public class factorial {

	public static void main(String[] args)
	
	{
	
	s n = new s();
	
	n.getdata();
	n.answer();
		
	}
}

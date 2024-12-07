package collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class serch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter The Serch Element");
		String n = ss.next();
		
		if(s.contains(n))
		{
			System.out.println(n+ " is found");
		}
		else
		{
			System.out.println(n+ " not fond");
		}
		
		
	}

}

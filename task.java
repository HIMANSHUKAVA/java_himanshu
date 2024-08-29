package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class task {
	
public static void main(String[] args) {
	
	
	
	
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Enter Your Name");
	String m = s.next();
	
	System.out.println("Enter Your Surname");
	String n = s.next();
	
	System.out.println("Enter Your Email");
	String o = s.next();
	
	System.out.println("Enter Your mobail");
	double p = s.nextDouble();
	
	System.out.println("Enter Your city");
	String q = s.next();
	
	
	
	ArrayList<model> s1 = new ArrayList();
	s1.add(new model(m,n,o));
	
	
	
	
	
	ArrayList<model> s2 = new ArrayList();
	s1.add(new model(p,q));
	
	s1.addAll(s2);
	
	Iterator  i = s1.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}

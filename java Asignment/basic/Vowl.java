package java_asignment;

import java.util.Scanner;

public class Vowl {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Text");
		String n  = s.next();
		
		if(n.length()>1)
		{
			System.out.println("Please Enter The Single Digit");
		}
		else
		{
         
		  char c = n.charAt(0);
		  if(c>=65 && c<=128) {
		  if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'||c=='A'||c=='E'||c=='O'||c=='U'||c=='I')
		  {
			  System.out.println("Vowl Text");
		  }
		  else
		  {
			  System.out.println("Component Digit");
		  }
		  }
		  else
		  {
			  System.out.println("Pleas Enter The Value Between A To Z");
		  }
		}
	}
}

package asigmnent;

import java.util.Scanner;

public class count_the_letter {

public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Your String ");
	String m = s.next();
	
	String hh = "My Name is Himanshu Kava";
     
     System.out.println("The Cherector Of String is :"+m.length());
     int count=0;
      for(int i=0;i<hh.length();i++)
      {
    	  if(hh.charAt(i)== ' ' )
    	  {
    	  count++;
    	  }
      }
     System.out.println("space of number is "+count);
	
//	System.out.println(hh.length());
	
//	
    

}

}

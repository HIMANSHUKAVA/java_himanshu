package collection2;

import java.util.HashSet;

public class hashset_to_array {

	   public static void main(String[] args) {
		
		   HashSet<String> s = new HashSet<String>();
		   s.add("apple");
		   s.add("mango");
		   s.add("graps");
		   s.add("Watermeln");
		   
		  String [] arr = s.toArray(new String[s.size()]);
		  
		  for(String n :arr)
		  {
			  System.out.println(n);
		  }
		   
		   
	}
	
	
}

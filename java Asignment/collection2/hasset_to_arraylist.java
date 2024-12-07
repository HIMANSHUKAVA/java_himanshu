package collection2;

import java.util.ArrayList;
import java.util.HashSet;

public class hasset_to_arraylist {

	public static void main(String[] args) {
		
		   HashSet<String> s = new HashSet<String>();
		   s.add("apple");
		   s.add("mango");
		   s.add("graps");
		   s.add("Watermeln");
		   s.add("graps");
		   System.out.println("Hashset\n"+s);
		   
		   ArrayList s1 = new ArrayList(s);
		   
		   System.out.println("arraylist\n"+s1);
		   
		   
		
		
	}
}

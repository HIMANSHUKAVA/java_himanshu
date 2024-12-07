package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_iterate {

	public static void main(String[] args) {
		   HashSet s = new HashSet();
		   s.add("apple");
		   s.add("mango");
		   s.add("graps");
		   s.add("Watermeln");
		   
		   Iterator i = s.iterator();
		   
		   while(i.hasNext())
		   {
			   System.out.println(i.next());
		   }
	}
}

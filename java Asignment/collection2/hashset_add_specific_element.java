package collection2;

import java.util.HashSet;

public class hashset_add_specific_element {

	
	public static void main(String[] args) {
		
   HashSet s = new HashSet();
   s.add("apple");
   s.add("mango");
   s.add("graps");
   s.add("Watermeln");
   
   System.out.println("Befor Add The New Element\n"+s);
   
//   add the new elemen
   
   s.add("cherry");
   
   System.out.println("After Adding New Element\n"+s);
		
		
	}
}

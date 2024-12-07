package collection2;

import java.util.ArrayList;
import java.util.Iterator;

public class first_position {

	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		s.add(0, "arti");
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

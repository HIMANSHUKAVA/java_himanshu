package collection2;

import java.util.ArrayList;
import java.util.Iterator;

public class joint_arraylist {

	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		
		ArrayList s1 = new ArrayList(s);	// to joit two arraylist using arraylit constructor
		
		s1.add(150);
		s1.add(120);
		s1.add(160);
		s1.add(190);
		
		
		Iterator i = s1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}

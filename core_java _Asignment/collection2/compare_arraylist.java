package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class compare_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		
		ArrayList s1 = new ArrayList();	
		
		s1.add(150);
		s1.add(120);
		s1.add(160);
		s1.add(190);
		
		System.out.println(s1.equals(s));
	}

}

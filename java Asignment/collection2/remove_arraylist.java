package collection2;

import java.util.ArrayList;

public class remove_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		
		ArrayList s1 = new ArrayList(s);	
		
		s1.add(150);
		s1.add(120);
		s1.add(160);
		s1.add(190);
		
		
		
		//remove the arraylist of s;
//		s1.removeAll(s);
//		System.out.println(s1);
		
		//remove specific object/value
		s1.remove("ankit");
		System.out.println(s1);
	}

}

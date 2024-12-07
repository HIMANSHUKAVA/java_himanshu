package collection2;

import java.util.HashSet;

public class retain_set {
	
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		
		
		HashSet s1 = new HashSet();
		s1.add(7);
		s1.add(8);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		
		
		s1.retainAll(s);
		System.out.println(s1);
	}

}

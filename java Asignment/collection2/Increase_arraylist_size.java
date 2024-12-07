package collection2;

import java.util.ArrayList;

public class Increase_arraylist_size {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> s = new ArrayList<Integer>(5);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		
		
		s.ensureCapacity(10);
		
		
		
		System.out.println(s.size());
		
	}
}

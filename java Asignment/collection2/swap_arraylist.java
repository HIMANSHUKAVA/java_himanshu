package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class swap_arraylist {
	
	public static void main(String[] args) {
		
		
		ArrayList s1 = new ArrayList();	
		
		s1.add(150);
		s1.add(120);
		s1.add(160);
		s1.add(190);
		
		Collections.swap(s1, 3, 1);
		
		System.out.println(s1);
	}

}

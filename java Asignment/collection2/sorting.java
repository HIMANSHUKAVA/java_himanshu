package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {

	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		Collections.sort(s);
		
		System.out.println(s);
		
	}
}

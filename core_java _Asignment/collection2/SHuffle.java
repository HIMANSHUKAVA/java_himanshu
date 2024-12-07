package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class SHuffle {
	
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
	
		System.out.println("befor shuffle");
		System.out.println(s);
		
		System.out.println("After SHuffle");
		Collections.shuffle(s);
		System.out.println(s);
	}

}

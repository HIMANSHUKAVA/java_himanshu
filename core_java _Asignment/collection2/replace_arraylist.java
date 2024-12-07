package collection2;

import java.util.ArrayList;

public class replace_arraylist {

	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		System.out.println("Befor replace \n"+s);
		s.set(2, "Krupa");
		// vishvas replace to krupa
		System.out.println("after Replace");
		System.out.println(s);
		
		
		
		
		
	}
}

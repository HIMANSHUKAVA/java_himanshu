package collection2;

import java.util.ArrayList;

public class position_in_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		s.add("himanshu");
		s.add("ankit");
		s.add("vishwas");
		s.add("pranav");
		s.add("abhay");
		
		
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
	}

}

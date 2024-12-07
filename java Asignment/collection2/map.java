package collection2;

import java.util.HashMap;
import java.util.Map;

public class map {
	
	
	public static void main(String[] args) {
		HashMap<Integer , String> s = new HashMap<>();
		s.put(1, "himanshu");
		s.put(2, "ankit");
		s.put(3, "shubhansh");
		
		
		for(Map.Entry me :s.entrySet())
		{
			System.out.println(me.getValue());
		}
 	}

}

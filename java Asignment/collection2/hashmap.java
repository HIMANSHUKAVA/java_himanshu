package collection2;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer , String> s = new HashMap();
		s.put(101,"himanshu");
		s.put(102,"ankit");
		s.put(103,"parth");
		s.put(104,"jasvant");
		s.put(105,"nilam");
		s.put(106,"aanshu");
		
		for(Map.Entry me : s.entrySet())
		{
			System.out.println(me.getKey()+"->"+me.getValue());
		}
		
		
		
		
		
		
	}

}

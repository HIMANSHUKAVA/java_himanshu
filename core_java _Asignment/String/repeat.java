package asigmnent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class repeat {

	public static void main(String[] args) 
	{

		
		   Scanner ss = new Scanner(System.in);
		   System.out.println("Enter The String");
		   String m  = ss.next();

	
		
		
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		
		char[] c = m.toCharArray();
		
		for(char ch:c)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		
		int max =0;
		char maxc = ' ';
		for(Map.Entry<Character, Integer>me:hm.entrySet())
	{
             if(max<me.getValue())
             {
			max = me.getValue();
			maxc = me.getKey();
             }
		}
		System.out.println("Repetation Charector Is :"+maxc);
	}
	
}

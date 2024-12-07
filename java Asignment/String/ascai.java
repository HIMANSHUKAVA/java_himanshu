package asigmnent;

import java.util.Scanner;

public class ascai {

	public static void main(String[] args) {
		
		char c;
		Scanner ss =new Scanner(System.in);
		
		System.out.println("Enter Your Charector");
		c = ss.next().charAt(0);
		
		int s = (char)c;
		
		System.out.println("The Number Of Charector Is :"+s);
		
	}

}

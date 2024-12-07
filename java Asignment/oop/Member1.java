package asigmnent;

import java.util.Scanner;

public class Member {
	
	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String n = h.nextLine();
		System.out.println("Enter Your Address : ");
		String o = h.nextLine();
		System.out.println("Enter Your Age");
		int c = h.nextInt();
		System.out.println("Enter Your Id :");
		int m = h.nextInt();
		System.out.println("Enter Your Mobain No :");
		double l = h.nextDouble();
		System.out.println("Enter Your Salary : ");
		float a = h.nextFloat();
		
		Model_Members s1 = new Model_Members();
		s1.display(m ,n, c,l,o,a);
		
	}

}

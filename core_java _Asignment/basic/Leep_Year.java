package java_asignment;

import java.util.Scanner;

public class Leep_Year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Year");
		int year = s.nextInt();
		if(year %4==0)
		{
			System.out.println("Leep Year");
		}
		else	
		{
			System.out.println("Normal Year");
		}
	}
}

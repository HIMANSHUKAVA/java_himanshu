package Task_27_07_2024;

import java.util.Scanner;

public class Monday_To_Sunday {

	public static void main(String[] args) {
		Scanner hk = new Scanner(System.in);
		
		System.out.println("Please Enter The Number");
		int n = hk.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default :
			System.out.println("Please Enter The Valid Number");
			break;
			
		}
	}
}

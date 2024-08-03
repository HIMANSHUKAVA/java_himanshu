package Task_27_07_2024;

import java.util.Scanner;

public class Addition_Using_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner hk = new Scanner(System.in);

		System.out.println("Please Enter The one  Number");
		int n = hk.nextInt();
		
		System.out.println("Please Enter The Second Number");
		int m = hk.nextInt();
		
		System.out.println("---------------------------------------");
		System.out.println("press 1 : Sum Of Two Number");
		System.out.println("Press 2 : substrection Of Two Number");
		System.out.println("Press 3 : multiplication Of Two Number");
		System.out.println("press 4 : Division Of Two Number");
		System.out.println("--------------------------------------");
		
		System.out.println("Please Enter Your Choice");
		int h = hk.nextInt();
		
		
		switch(h)
		{
		case 1:
			System.out.println("The Sum Of Two Number Is : "+(n + m));
			break;
		case 2:
			System.out.println("The Substretion Of Two Number Is : "+(n-m));
			break;
		case 3:
			System.out.println("The Multiplication Of Two Number Is :"+(n*m));
			break;
		case 4:
			System.out.println("The Division Of Two Number Is :"+(n/m));
			break;
			
		default :
			System.out.println("Please Enter The Valid Number : ");
			break;
		}
	}

}

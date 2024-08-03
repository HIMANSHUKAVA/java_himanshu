package Task_27_07_2024;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		Scanner hk = new Scanner(System.in);
		
		System.out.println("Enter The Number Of table : ");
		int d = hk.nextInt();
		int i=1;
		int sum =1;
		while(i<=10)
		{
			sum = i*d;
			System.out.println(d+"*"+i+"="+sum);
			i++;
		}
		
	}

}

package asigmnent;

import java.util.Scanner;

public class n_nn_nn {

  public static void main(String[] args) {
	
	  Scanner s = new  Scanner(System.in);
	  
	  System.out.println("Enter The Number");
	  int n = s.nextInt();
	 
	  int n2 = n*10+n;  // n = 5 , n2=5*10=50+5=55 , 
	  int n3 = n*100+n2;  // 500+55=555
	  
	  int result = n + n2+n3;
	  
	  System.out.println("the result is :"+result);
	  
}

}

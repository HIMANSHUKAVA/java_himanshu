package java_10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class task {
	
	public static void main(String[] args) throws IOException {
		
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter Your First_Name : ");
		 String first_name = s.next();
		 System.out.println("Enter Your last_Name :");
		 String Last_Name = s.next();
		 System.out.println("Enter Your Password: ");
		 int Password = s.nextInt();
		 System.out.println("Enter Your Email : ");
		 String Email = s.next();
		 
		 String Userdata = "Your First name is : "+first_name +"\n"+" Your last name is : "+ Last_Name 
		+ "\n"+"Your Email Is : "+Email + "\n" + "Your Password Is : "+ Password;
	     
		 FileOutputStream sd = new FileOutputStream("D:\\Task2.txt");
		 System.out.println("Sucess");
		 byte[] bytes = Userdata.getBytes();
		 sd.write(bytes);
		 
		
		
		 
	}
         

}

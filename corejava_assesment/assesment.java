package projects;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

 //       Username = tops ,  password = 2005




class book
{
	int id;
	String name;
	String author;
	int quantity;
	int price;
	
	public book(int id , String name , String author , int quantity , int price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
		this.price=price;
	}
}
public   class assesment
{

	
	static Scanner ss = new Scanner(System.in);
	static String url = "jdbc:mysql://localhost:3306/assesment";
	static String pass="";
	static String user="root";

	
	 public static   void gdata(String  i)
     {
		 int r=0;
		 

		 
        ArrayList<book>m = new ArrayList<>();
  	   
        
        

        
        System.out.println("book category"+i);  
		System.out.println("Enter The Book Id");
		int id = ss.nextInt();
		System.out.println("Enter The Book Name");
		String name =  ss.next();
		System.out.println("Enter The Book Author");
		String author =  ss.next();
		System.out.println("Enter The Quantity");
		int q =  ss.nextInt();
		System.out.println("Enter The Price");
		int price =  ss.nextInt();
		
		 m.add(new book(id, name, author, q, price));
		 

	
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement("insert into  addbook (id ,name , author , quantity , price , category) values(?,?,?,?,?,?)");	
			
			for(book book :m)
			{
				ps.setInt(1, book.id);
				ps.setString(2, book.name);
				ps.setString(3, book.author);
				ps.setInt(4, book.quantity);
				ps.setInt(5,book.price);
				ps.setString(6, i);
				r = ps.executeUpdate();
			}
			

			if(r>0)
			{
				System.out.println("sucess");
			}
			else
			{
				System.out.println("fail");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
  	
		
  	   
		
     }
     public static  void  detail()
	{
		System.out.println("1) Add Book");
		System.out.println("2) Deleat Book");
		System.out.println("3) Serch Book");
		System.out.println("4) View Book");
		System.out.println("5) Change password");
		System.out.println("6) Close Application");
		
		System.out.println("Enter Your choice");
		int k =  ss.nextInt();
		
		if(k==1)
		{
			fdta();
		}
		else if(k==2)
		{
			deleatdata();
		}
		else if(k==3)
		{
		
			serchdata();
		}
		else if(k==4)
		{
			viewdata();
		}
		else if(k==5)
		{
			repass();
		}
		else if(k==6)
		{
			try
			{
			
	            Thread.sleep(2000);

	            System.out.println("Program will close after 3 seconds...");

	            Thread.sleep(3000);
	            
	            System.exit(0);
				
			}
			catch(Exception e)
			{
	            e.printStackTrace();
			}
			
		}

		
		
	}
	 public static  void sdata()

	
	{
		


	
	System.out.println("Enter The Username");
	String s = ss.next();
	
	System.out.println("Enter The Password");
	String n = ss.next();
	
	

	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =  DriverManager.getConnection(url, user, pass);
		PreparedStatement ps = con.prepareStatement("select password from si where username=?");
		ps.setString(1, s);
		
		ResultSet set = ps.executeQuery();
		if(set.next())
		{
			String dbpass =  set.getString(1);
			
			if(n.equals(dbpass))
			{
			

				detail();
				
				
			}
			else
			{
			 System.out.println("Login Fail Please Try Again");
			}
				
		}		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
	}
	 static void fdta()
	{
		int c;
       
        
		System.out.println("1) computer");
		System.out.println("2) Electronic");
		System.out.println("3) Electrical");
		System.out.println("4) Civil");
		System.out.println("5) Mechinical");
		System.out.println("6) Arechitecture");
		System.out.println("7) Back to main menue");
		
		System.out.println("Enter your choice");
		c = ss.nextInt();
		
		
		
	    if(c==1) gdata("computer");  
	    else if(c==2)gdata("Electronic");
	    else if(c==3)gdata("Electrical");
	    else if(c==4)gdata("Civil");
	    else if(c==5)gdata("Mechenical");
	    else if(c==6)gdata("Arechitecture");
	    
	    
		
	}
     public static void deleatdata()
	{
    	 System.out.println("Please Enter The Book Id");
    	 int y =  ss.nextInt();
		
		try
		{
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql="delete from addbook where id='"+y+"' ";
			PreparedStatement ps =  con.prepareStatement(sql);
			int t =  ps.executeUpdate();
			if(t>0)
			{
				System.out.println("Sucessfully Deleted");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	

     public static void serchdata()
     {
    	 
    	 System.out.println("Serch By id");
    	 System.out.println();
    	 System.out.println("Serch By Name");
    	 
    	System.out.println("Enter Your choice");
    	int choice =  ss.nextInt();
    	 
    	
        LinkedHashSet<Object> set = new LinkedHashSet<>();
    	
          
      
    	if(choice==1)
    	{
    		System.out.println("Enter The Book Id");
    		int id = ss.nextInt();
    		
    		try
    		{
    			Class.forName("com.mysql.jdbc.Driver");
    			Connection con =DriverManager.getConnection(url, user, pass);
    			String sql =  "select * from addbook where id=?";
                PreparedStatement ps = con.prepareStatement(sql);
    			ps.setInt(1, id);
    			ResultSet set1 = ps.executeQuery();
    			
    			
    			
    			
    			if(set1.next())
    			{
    				System.out.println("The Book Is Available");	
    				
    				set.add(set1.getInt(1));
    				set.add(set1.getString(2));
    				set.add(set1.getString(3));
    				set.add(set1.getString(4));
    				set.add(set1.getString(5));
    				set.add(set1.getString(6));
    				
    				

    	            
    	            
    	            Iterator i = set.iterator();
    	            
    	            while(i.hasNext())
    	            {
    	            System.out.println("Book Details:");
    	            System.out.println("Book ID: " + i.next());
    	            System.out.println("Book Name: " + i.next());
    	            System.out.println("Book Author: " + i.next());
    	            System.out.println("Book Quantity: " + i.next());
    	            System.out.println("Book Price: " + i.next());
    	            System.out.println("Book Category: " + i.next());
    	           
    	            }
    			           		
    			
    				
    			}
    			
    		    else
    			{
    				System.out.println("The Book Is Not Available");
    			}
    			
 	
				
    			
    			
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		
    		
    		
    	}
    	else
    	{
    		System.out.println("Enter The Book Name");
    	    String name  = ss.next();
    		
    	    LinkedHashSet<Object> set1 = new LinkedHashSet<>();
    	    
    	    try
    	    {
    	    	Class.forName("com.mysql.jdbc.Driver");
    			Connection con =DriverManager.getConnection(url, user, pass);
    			String sql =  "select * from addbook where name=?";
                PreparedStatement ps = con.prepareStatement(sql);
    			ps.setString(1, name);
    			
    			
    			ResultSet set2 = ps.executeQuery();
    			
    			if(set2.next())
    			{
    				System.out.println("The Book Is Available ");
    				set.add(set2.getInt(1));
    				set.add(set2.getString(2));
    				set.add(set2.getString(3));
    				set.add(set2.getString(4));
    				set.add(set2.getString(5));
    				set.add(set2.getString(6));
    				
    		        
    	            Iterator i = set.iterator();
    	            
    	            System.out.println("Book Detail : ");
    	            while(i.hasNext())
    	            {
    	            System.out.println("Book Details:");
    	            System.out.println("Book ID: " + i.next());
    	            System.out.println("Book Name: " + i.next());
    	            System.out.println("Book Author: " + i.next());
    	            System.out.println("Book Quantity: " + i.next());
    	            System.out.println("Book Price: " + i.next());
    	            System.out.println("Book Category: " + i.next());
    	           
    	            }
    				
    			}
    			else
    			{
    			System.out.println("The Book Is Not Available");	
    				
    			}
    			
    			
    			
    	    }
    	    catch(Exception e)
    	    {
    	    	e.printStackTrace();
    	    }
    	    
    	    
    	    
    		
    	}
    	 
    	 
    	 
    	 
    	 
     }
	
     
	public static void viewdata()
	{

    	LinkedHashSet list =  new LinkedHashSet();
		try
		{
	    	Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement("select * from addbook");
			ResultSet set = ps.executeQuery();
			
//			System.out.println("ID\tName\tauthor\tquantity\tprice\tcategory");
			  System.out.println("ID\tName\t\tPrice\t\tquantity\tauthor\t\tcategory");
			  
            System.out.println("-------------------------------------------------------------------------------------------------");
            
			while(set.next())
			{

		       int id = set.getInt(1);
		       String name =  set.getString(2);
		       String author = set.getString(3);
		       String quan = set.getString(4);
		       String price = set.getString(5);
		       String cat = set.getString(6);
		       
		      // System.out.println(id + "\t" + name + "\t\t" + author + "\t\t" +quan + "\t\t" + price + "\t\t" + cat );
		       
		       System.out.println(id + "\t" + name + "\t\t" + price + "\t\t" + quan + "\t\t" + author + "\t\t" + cat);;
		
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void repass()
	{
		System.out.println("Enter The Old Username");
		String oldname =  ss.next();
		
		System.out.println("Enter The Old Password");
		String oldpass =  ss.next();
		
		System.out.println("Enter The New Username");
		String newname =  ss.next();
		
	    System.out.println("Enter The New Password");
		String newpass =  ss.next();
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement("update si set  username=?,password=?");
			ps.setString(1 , newname);
			ps.setString(2, newpass);
			
			int r =  ps.executeUpdate();
			
			if(r>0)
			{
				System.out.println("Password Sucessfully changed");
			}
			else
			{
				System.out.println("Fail");
			}
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		sdata();
	
	 
	}
	
}

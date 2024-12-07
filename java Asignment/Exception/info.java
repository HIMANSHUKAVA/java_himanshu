package Exception;
class AgeNotFoundException extends Exception
{
	

	public AgeNotFoundException(String message) {
		super(message);
	}
	
}
class NameNotFoundException extends Exception
{
	

	public NameNotFoundException(String message) {
		super(message);
	}
	
}


class Student
{
	int roll_no , age;
	String name , cource;
	
	public Student(int roll_no  , int age , String name , String cource ) throws AgeNotFoundException , NameNotFoundException {
		// TODO Auto-generated constructor stub
		
		if(age<15  || age>21)
	    {
			throw new AgeNotFoundException("Age Is Not Valid");
		
		}
		else
		{
			System.out.println("Welcome");
		}
		if(!name.matches("[a-zA-Z]+"))
		{
	     throw new NameNotFoundException("Invalid Name");	
		}

		
		this.roll_no=roll_no;
		this.age=age;
		this.name=name;
		this.cource=cource;
		

	}
	public void display() {
        System.out.println("Roll no" + roll_no);
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("cource " + cource);
    }
	
	
}
public class info {
	public static void main(String[] args) throws AgeNotFoundException , NameNotFoundException
	{
		
   
//	  Student s = new Student(14, 18, "123", "d");// this object throw namenotfoundexception;
//		s.display();
	   Student s1 = new Student(14, 12, "himanshu", "c++");
	   s1.display();
	  
		
	}
}

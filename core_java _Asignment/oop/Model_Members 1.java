package asigmnent;

public class Model_Members {

	int data_member_id;
	String name;
	int age;
	double phone_number;
    String address;
    float salary;
	public int getData_member_id() {
		return data_member_id;
	}
	public void setData_member_id(int data_member_id) {
		this.data_member_id = data_member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(double phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
    
 void display(int data_member_id ,String name , int age , double phone_number , String address , float salary)
	{
		System.out.println("Your Member Id Is : "+data_member_id);
		System.out.println("Your Name Is : "+name);
		System.out.println("Your Age Is : "+age);
		System.out.println("Your Mobail Number Is : "+phone_number);
		System.out.println("Your Address Is : "+address);
		System.out.println("Your Salary Is : "+salary);
	}
    
    
    
    
}

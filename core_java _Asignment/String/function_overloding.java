package asigmnent;
class print_number
{
	public static void printn(int a)
	{
		System.out.println(a);
	}

	public static void printn(float b)
	{
		System.out.println(b);
	}
	public static void printn(char c)
	{
		System.out.println(c);
	}
	public static void printn(String d)
	{
		System.out.println(d);
	}
	public static void printn(boolean a)
	{
		System.out.println(a);
	}
}


public class function_overloding {
	
	
public static void main(String[] args) {
	
	print_number ss = new print_number();
	ss.printn(3);
	
	ss.printn(true);
    ss.printn("himanshu");
    ss.printn('s');
    ss.printn(1.02f);
}

}

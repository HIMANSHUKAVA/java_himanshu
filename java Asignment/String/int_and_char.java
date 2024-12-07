package asigmnent;
class a
{
	public void s(int m ,char p)
	{
		System.out.println(m);
		System.out.println(p);
	}
	public void s(char p,int m)
	{
		System.out.println(p);
		System.out.println(m);
	}
}
public class int_and_char {

	public static void main(String[] args) {
		
		a b = new a();
		b.s(2, 's');
		b.s('h', 3);
	}
}

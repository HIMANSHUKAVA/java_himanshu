package asigmnent;
abstract class ss 
{
	abstract void message();
}
class n extends ss
{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This Is Second Sub Class");
		
	}
}
class ok extends ss
{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This Is First Sub Class");
		
	}
}
public class abstrect_print {

	public static void main(String[] args) {

		ss o = new n();
		ss l = new ok();
		
		l.message();
		o.message();
		
	}
}

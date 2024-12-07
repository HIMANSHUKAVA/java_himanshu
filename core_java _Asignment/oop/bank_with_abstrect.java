package asigmnent;
abstract class ass
{

 abstract void message();
	
}
class bankA extends ass
{

	int balance;
	
	
	public bankA(int balance) {
	
		this.balance=balance;
	}
	@Override
	void message() {
		
	   System.out.println("Bank A Deposite Amount Is :"+balance);
		
	}
	
}
class bankB extends ass
{

	int balance;
	
	
	public bankB(int balance) {
	
		this.balance=balance;
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		 System.out.println("Bank B Deposite Amount Is :"+balance);
		
	}
	
}
class bankC extends ass
{

	int balance;
	
	
	public bankC(int balance) {
	
		this.balance=balance;
	}
	@Override
	void message() {
		
		 System.out.println("Bank c Deposite Amount Is :"+balance);
	}
	
}


public class bank_with_abstrect {
	
	public static void main(String[] args) {
		
		ass s =new bankA(100);
		ass m = new bankB(150);
		ass n = new bankC(200);
		
		
		s.message();
		m.message();
		n.message();
		
		
		
	}

}

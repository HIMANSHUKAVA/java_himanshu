package Exception;
class system
{
	String name;
    double number;
    int opening;
    int withdrawl;
    
    
    public system(String name ,double number,int opening,int withdrawl) {
    	
	     this.name=name;
	     this.number=number;
	     this.opening=opening;
	     this.withdrawl=withdrawl;
	     
	}
    
    void show()
    {
    	System.out.println("Your Opening Amount Is "+opening);
    }
    void withdata()
    {
    	if(opening > withdrawl)
    	{
    		System.out.println("Your Total Balance Is :"+(opening-withdrawl));
    		
    	}
    	else
    	{
    		int p = withdrawl-opening;
    		throw new ArithmeticException("Sorry, insufficient balance, you need more " +p + " Rs. To performthis transaction");
    	}
    }
    
}
public class bank {

	public static void main(String[] args) {
	    system s = new system("himanshu", 187020, 36500, 39000);
	    s.withdata();
	    

	}

}

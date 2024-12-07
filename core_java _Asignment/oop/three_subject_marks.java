package asigmnent;
abstract class marks
{
 abstract void getpercentage();
}

class StudentA extends marks
{
	
	
	float account , state , economic;
	
	
	public StudentA(float account , float state , float economic) 
	{

		this.account=account;
		this.state=state;
		this.economic=economic;
		
	}
	@Override
	void getpercentage() {
		
		System.out.println("Tota Mark Of A Is :"+(account+state+economic));
		System.out.println("Percentage Of A :"+(account+state+economic)/100 );
	}
}

class StudentB extends marks
{
	float account , state , economic , spcc;
	
      public StudentB(float account , float state , float economic , float spcc) 
      {
    	  this.account=account;
    	  this.state=state;
    	  this.spcc=spcc;
    	  this.economic=economic;
    	  

	}
	
	@Override
	void getpercentage() {
 
		System.out.println("Tota Mark Of B Is :"+((account+state+economic+spcc)));
		System.out.println("Percentage Of B :"+(account+state+economic+spcc)/100 );
		
	}
	
}


public class three_subject_marks {
	
	public static void main(String[] args) {
		
		marks a = new StudentA(99, 97, 98);
        marks b = new StudentB(97, 94, 96, 91);
		
		a.getpercentage();
		b.getpercentage();
		
	}
}

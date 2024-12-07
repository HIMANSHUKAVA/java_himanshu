package asigmnent;

class cm
{
	 int real;
	 int img;
	 public cm()
	 {
		 
	 }
	
	 public cm(int real , int img) {
		// TODO Auto-generated constructor stub
		 
		 this.real=real;
		 this.img=img;
		 
	}
	 
	 void display()
	 {
		 System.out.println(real+"+"+img);
	 }
	

	 public static cm add(cm s,cm n)
	 {
		cm r1 =  new cm();
		r1.real =  s.real+n.real;
		r1.img = s.img+n.img;
		 
		return r1;
		 
	 }
}

public class complex {
	
public static void main(String[] args) {
	
	cm cm1=new cm(5, 8);
	cm cm2=new cm(9, 4);
	
	cm c3 =  cm.add(cm1, cm2);
	
	cm1.display();
	cm2.display();
	c3.display();
	

	
	
}

	
	

}

package collection;

public class model {
	

	String Surname;
	String name;
	String email;
    double mobail;
    String city;

    
    public model(String name , String Surname,String email) {
    	
    	this.name=name;
    	this.Surname=Surname;
    	this.email=email;
	   
    	
	}
    
    
    public model(double mobail , String  city) 
    {
    	
      this.mobail = mobail;
      this.city = city;
    	
	}


	public String getSurname() {
		return Surname;
	}


	public void setSurname(String surname) {
		Surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getMobail() {
		return mobail;
	}


	public void setMobail(double mobail) {
		this.mobail = mobail;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
    
    
  public String toString()
  {
	return name+"\n"+Surname+"\n"+email+"\n"+mobail+"\n"+city+"\n"; 
  }
    
    
    

    
    
    
}

public class Account {
	
	int id ;
	float balance;
	String name ;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, float balance, String name) {
		//super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	
	// code for checking equality 
	// each instance variable 
	
	//method name equals 
	// long l  = 10L ;
	// Object   = Account ;
// wide Object Super class      Account  Employee Date
	
	// instanceof  // run time data type of Object 
	public boolean equals1(Object obj) {		
		Account temp = (Account) obj;
		if((this.id == temp.id) 
				&& (balance == temp.balance) 
				&& (name.equals(temp.name))) {
			return true;
		}  else  {
			return false;
		}
	}
	
	
	// instanceof   equals method 
	public boolean equals(Object obj) {			
		if(obj instanceof Account) {
			
		Account temp = (Account) obj;
		
return((this.id == temp.id) 
				&& (balance == temp.balance) 
				&& (name.equals(temp.name))); 
					
		}
		
		else 
			return false;
	}
	
	public boolean checkEquality(Account temp) {		
		// this == a1
		if((this.id == temp.id) 
				&& (this.balance == temp.balance) 
				&& (this.name.equals(temp.name))) {
			return true;
		}  else  {
			return false;
		}
	}
	

}











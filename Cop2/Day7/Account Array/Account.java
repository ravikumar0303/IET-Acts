//Entity 
public class Account {
	
	int id ;
	String name;
	float balance ;

	public Account() {

	System.out.println( "hello");
		
	}

	public Account(int id, String name, float balance) {

		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String showData() {
		return "Account [id=" + id + ", name=" +  ", balance=" + balance + "]";
	}
	
	public void showDetails() {
		System.out.println( "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]");
	}
	
	

}





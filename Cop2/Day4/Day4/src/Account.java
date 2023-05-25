public class Account {
	
	// instance 
	String name ;
	int id ;
	float balance;
	// static modifier    single copy 
	static float iRate = 3.2f;
	
	//local
	public Account
	(String name1, int id1, float balance1) {
		super();
		name = name1;
		
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// non static Object - static and non static 
	public void printDetails(){		
		System.out.println("Account id " + id);
		System.out.println("intrest rate " + iRate);
	}
	 // static - single copy . Class Name 
	// static methods can access only static variable
	public static void printDetails1(int y){		
		System.out.println(y);
		//System.out.println("Account id " + id);
		System.out.println("intrest rate " + iRate);
	}
	
	public static void printDetails1(Account a){		
		System.out.println("Account id " + a.id);
		System.out.println("intrest rate " + iRate);
	}
	
	
	public String showData() {
		//System.out.println();
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
	public static void main(String[] args) {
		//System.out.println(w);
		 int w = 5;  // local
		Account acc1 = new Account("a", 1001, 45896f);
		System.out.println(acc1.hashCode());// memory location 
		System.out.println(acc1.showData());
		
		// static var - static method
		System.out.println(iRate);
		System.out.println(Account.iRate);
		System.out.println(acc1.iRate);
		
		// non static 
		System.out.println(acc1.id);
		
		Account acc2 = new Account("b", 1002, 4596f);
		System.out.println(acc2.hashCode());
		System.out.println(acc2.showData());
		System.out.println(acc2.iRate);
		acc2.iRate = 3.6f;
		Account acc3 = new Account("c", 1003, 4589f);
		System.out.println(acc3.hashCode());
		System.out.println(acc3.showData());
		System.out.println(acc3.iRate);
	}
	
	

}

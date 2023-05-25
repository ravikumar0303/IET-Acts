class Account{

	//instance 
	int accId ,  pincode ;  // de 
	String name;
	float balance;
	//static single copy 
	static int iRate;
	
	//method 
	
	//default constructor
	public Account(){
		//parametrised 
		this(001 , "Dummy " , 152.3f , 004);
	
	}
	
	
	// parametrised passa 
	public Account (int accId , String n , float b ,  int j){  // this  - current class Object 
		//Account
		// i local variables	
		//this.accId = accId ;//assigment operator 
		////name = n;
		//balance = b;
	// current class Object 
		this(accId , n , b);
System.out.println("Account 4 parameters Constructor");			
		pincode = j;
	}
	
	public Account (int accId , String name , float balance){  
		System.out.println("Account 3 parameters Constructor");		
	this.accId = accId ;//assigment operator 
	this.name = name;
	this.balance = balance;
	}
	
	// this hidden referance it is passed when we are //calling instance method 
	public void showData(){
		
		System.out.println("Account id "+ accId);
		System.out.println("Account Holder name "+ name);
	}
	
	
	public void acceptData(){
	                                                                                                                                                           
	
	}
	
	
	public static void main(String[] args){
		
		Account a = new Account();
		
		a.showData();
		
		Account a1 = new Account(1258 , "A" , 5698.0f , 003);
		
			a1.showData();
		
		
		
		
	}

}
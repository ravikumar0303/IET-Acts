
public class Account
{

	int accId ,  pin ;
	String name ;
	float balance;
	static int iRate;
	public Account() 
	{
		
	}
	public Account(int accId, int pin, String name, float balance) 
	{
		super();
		this.accId = accId;
		this.pin = pin;
		this.name = name;
		this.balance = balance;
	}
	
	public String ShowData(){
		return "Account [accId=" + accId + ", pin=" + pin + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
}

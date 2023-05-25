import java.util.Scanner;
public class AccountArray
{
int accId, pin;
String name;
float balance;
static int iRate;

public AccountArray()
{

}
public AccountArray(int accId,int pin, String name, float balance)
{
	super();
	this.accId = accId;
	this.pin = pin;
	this.name = name;
	this.balance = balance;
	
}

public String showData()
{
	return "Account [accId=" + accId + ", pin=" + pin + ", name=" + name + ", balance=" + balance + "]";
	
}

}
import java.util.Scanner;
public class AccountService
{
	AccountService()
	{
		
	}
	
	public static void Createaccount(Account a[])
	{
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter Account deatils for account : "+(i+1));
		System.out.print("Enter Name : ");
		String name=sc.nextLine();
		
		System.out.print("Enter Id : ");
		int Id = sc.nextInt();
		
		System.out.print("Enter Balance : ");
		float balance=sc.nextFloat();
		
		a[i]=new Account(name,Id,balance);
		}
	}
	
	public static void displayAccount(Account a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].ShowData());
		}
	}
	
	public static void updateAccount(Account a[])
	{
		
	}
	
	
}

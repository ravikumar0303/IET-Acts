import java.util.*;
public class CheckEven{
	int n;
	Scanner sc=new Scanner (System.in);
	
	public void acceptData() 
	{
		System.out.println("Enter your number");
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("0 is not a even and not a odd");
		}
		else {
			for(int i=1;i<=n;i++)
			{
				if(n%2==0)
				{
					System.out.println("your number is even");
					break;
				}else
				{
					System.out.println("your number is not even");
				break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		CheckEven ce=new CheckEven();
		ce.acceptData();
		
	}
 
}

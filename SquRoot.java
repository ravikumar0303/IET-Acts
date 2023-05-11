import java.util.*;
public class SquRoot {
	int n,i,p,sqrt;
	int count=1;
	Scanner sc=new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("enter your number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			count=i*i;
			
		}
		System.out.println("squre is =" +count);
	}
	
	public static void main(String[] args)
	{
		SquRoot sq=new SquRoot();
		sq.acceptData();
	}

}
